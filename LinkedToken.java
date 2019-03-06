import java.util.HashMap;
import java.util.Map;
/**
 * Stores a token, possibly linked to sequential tokens in sequential order.
 * @author    Heather N. Larsen
 * @version   1.0    2019/03/05    18:16MST
 * @param <T> generic token
 */
public class LinkedToken <T> {
    //GLOBAL VAR================================================================
    private int         idx; // index of the token (0 being the first token)
    private T           tkn; // String representation of the token
    private LinkedToken prv; // previous token, if one exists
    private LinkedToken nxt; // next token, if one exists
    private static LinkedToken lst; // last token in set
    private static Map<Integer,LinkedToken>  tbl; // look-up table
    //GLOBAL VAR================================================================
    /**
     * Creates a token with sequential order linking capabilities; pseudo-array.
     * @param  tkn  the token represented by a String
     */
    public LinkedToken(T tkn) {
        this.tkn = tkn;
        this.prv = null;
        this.nxt = null;
        this.idx = 0;
        this.lst = this;
        this.tbl = new HashMap<>();
        this.tbl.put(idx, this);
    }
    //LinkedToken(T)=======================================================
    /**
     * Creates the tokens following the first.
     * @param  tkn  the token represented by a String
     * @param  idx  the index of the token
     * @param  map  the original table
     * @param  prv  previous LinkedToken
     */
    private LinkedToken(T tkn, int idx, Map<Integer,LinkedToken> map, LinkedToken prv) {
        this.tkn = tkn;
        this.idx = idx;
        this.tbl = map;
        this.prv = prv;
        this.nxt = null;
        this.lst = this;
        this.tbl.put(idx, this);
    }
    //LinkedToken(T,int,Map<Integer,LinkedToken),LinkedToken===============
    /**
     * Creates the next token.
     * @param  tkn  the next LinkedToken
     */
    public void createNext(T tkn) {
        LinkedToken next = new LinkedToken(tkn,idx+1,tbl,this);
        this.nxt = next;
    }
    //createNext(tkn)===========================================================
    /**
     * Returns the next token based on the current token.
     * @return next LinkedToken
     */
    public LinkedToken getNext() {
        return this.nxt;
    }
    //getNext()=================================================================
    /**
     * Returns the previous token based on the current token.
     * @return previous LinkedToken
     */
    public LinkedToken getPrev() {
        return this.prv;
    }
    //getPrev()=================================================================
    /**
     * Returns the last token in the set.
     * @return last LinkedToken in set
     */
    public LinkedToken getLastToken() {
        return this.lst;
    }
    //getLastToken()============================================================
    /**
     * Returns the last token's index.
     * @return last LinkedToken's index
     */
    public int getLastIndex() {
        return this.lst.idx;
    }
    //getLastIndex()============================================================
    /**
     * Returns a token based on its index.
     * @param  idx  the look-up index
     * @return LinkedToken at idx
     */
    public LinkedToken getToken(int idx) {
        return tbl.get(idx);
    }
    //getToken(int)=============================================================
    /**
     * Returns an index for the token.
     * @return the index
     */
    public int getIndex() {
        return this.idx;
    }
    //getIndex()=============================================================
    /**
     * Returns a String representation of this token and all following tokens.
     * @return full String representation of this token and following tokens
     */
    public String iterateTokens() {
        String expr = new String();
        
        expr += this.toString() + " ";
        LinkedToken curr = this;
        while(curr.nxt != null) {
            curr = curr.nxt;
            expr += curr.toString() + " ";
        }
        
        return expr;
    }
    //iterateTokens()===========================================================
    @Override
    public String toString() {
        return tkn.toString();
    }
    //toString()================================================================
}
//LinkedToken.java==============================================================
