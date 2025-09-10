package com.OOPS.Genrics.Bounded;

public class singleBound<N extends Number> {
    private N value;

    public N getValue(){
        return value;

    }
    public void setValue(N value){
        this.value=value;
    }
}
