package jambda.lang.builder;

import java.util.StringJoiner;

/**
 * Created by Hakan on 1/17/2015.
 */
public abstract class Builder implements Modifier {

    StringBuilder strBuilder;

    public Builder(StringBuilder builder) {
        this.strBuilder = builder;
    }

    public void updateBuilder(String builder) {
        this.strBuilder.replace(0, strBuilder.length(), builder);
    }

    public Builder append(String str) {
        strBuilder.append(str);
        return this;
    }

    public Builder append(StringJoiner joiner) {
        strBuilder.append(joiner);
        return this;
    }

    public Builder append(StringBuilder builder) {
        strBuilder.append(builder);
        return this;
    }

    public Builder appendSpace() {
        strBuilder.append(" ");
        return this;
    }

    public Builder appendSemiColon() {
        strBuilder.append(";");
        return this;
    }

    public Builder appendSemiColonAndNewLine() {
        strBuilder.append(";").append(System.lineSeparator());
        return this;
    }

    public Builder appendNewLine() {
        strBuilder.append(System.lineSeparator());
        return this;
    }

    public Builder appendEqual() {
        strBuilder.append(" = ");
        return this;
    }

    public Builder appendTab(int level) {
        for (int i = 1; i <= level; i++)
            strBuilder.append("    ");
        return this;
    }

    public Builder appendLPAREN() {
        strBuilder.append("(");
        return this;
    }

    public Builder appendRPAREN() {
        strBuilder.append(")");
        return this;
    }

    public Builder appendLCBRACKET() {
        strBuilder.append("{");
        return this;
    }

    public Builder appendRCBRACKET() {
        strBuilder.append("}");
        return this;
    }

    public Builder appendDOT() {
        strBuilder.append(".");
        return this;
    }

    public Builder appendIF() {
        strBuilder.append("if");
        return this;
    }

    /**
     * Get StringBuilder including the intended source code
     *
     * @return
     */
    public StringBuilder getBuilder() {
        return strBuilder;
    }

    public Builder replace(String oldStr, String newStr) {
        this.updateBuilder(strBuilder.toString().replace(oldStr, newStr));
        return this;
    }

}
