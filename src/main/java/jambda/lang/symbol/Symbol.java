package jambda.lang.symbol;


/**
 * Created by Hakan on 1/12/2015.
 */
public abstract class Symbol {

    private String symbolName;
    private String prefixName;
    private String symbolType;
    private String typeClass;
    private int address;
    private int lineNumber = -1;
    private byte nestingDepth = 0;

    // where am I? ; I belong to which scope?
    private Scope inScope;
    // But, Do I have my own scope?
    private Scope myScope;

    public Symbol() {
        setSymbolName("");
        setSymbolType("");
    }

    public Symbol(String name, String type) {
        setSymbolName(name);
        setSymbolType(type);
    }

    public Symbol(String name, String type, String typeClass) {
        setSymbolName(name);
        setSymbolType(type);
        setTypeClass(typeClass);
    }

    /**
     * Returns its corresponding scope
     *
     * @return Scope
     */
    public Scope getMyScope() {
        return myScope;
    }

    /**
     *
     * @param myScope set its corresponding scope
     */
    public void setMyScope(Scope myScope) {
        this.myScope = myScope;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getTypeClass() {
        return typeClass;
    }

    protected void setTypeClass(String typeClass) {
        this.typeClass = typeClass;
    }

    private void setAddress() {
        address = this.hashCode();
    }

    public String getAddress(){ return  String.join("::",symbolName,String.valueOf(address)); }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * Returns scope to which it belongs
     *
     * @return Scope
     */
    public Scope getInScope() { return inScope; }

    public void setInScope(Scope scope) {
        this.inScope = scope;
    }

    public short getNestingDepth() {
        return nestingDepth;
    }

    public void setNestingDepth(byte nestingDepth) {
        this.nestingDepth = nestingDepth;
    }

    public String getSymbolType() {
        return symbolType;
    }

    public void setSymbolType(String symbolType) {
        this.symbolType = symbolType;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
        setPrefixName(symbolName);
    }

    private void setPrefixName(String name){
        this.prefixName = name;
    }

    public String getPrefixName() {
        return prefixName;
    }

    @Override
    public String toString() {
        return "{" + "\"Name\" : " + "\"" + getSymbolName() + "\", \"Type \" : \"" + getSymbolType() + "\", \"Line\" : \"" + getLineNumber() + "\"}";
    }
}
