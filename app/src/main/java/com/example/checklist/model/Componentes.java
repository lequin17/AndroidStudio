package com.example.checklist.model;

import android.widget.CheckBox;
import android.widget.RadioButton;

public class Componentes {

    private String item, observacao;
    private RadioButton ok;
    private RadioButton notOk;

    public Componentes(String item, String observacao, boolean b, boolean b1){
        this.item = item;
        this.observacao = observacao;
        this.ok = ok;
        this.notOk = notOk;

    }

   /* public Componentes(String item, String observacao, CheckBox ok, CheckBox notOk) {
        this.item = item;
        this.observacao = observacao;
        this.ok = ok;
        this.notOk = notOk;
    }*/

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public RadioButton getOk() {
        return ok;
    }

    public void setOk(RadioButton ok) {
        this.ok = ok;
    }

    public RadioButton getNotOk() {
        return notOk;
    }

    public void setNotOk(RadioButton notOk) {
        this.notOk = notOk;
    }
}
