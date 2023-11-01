package com.tdeauladoze.app.rules.shared.objectvalues;

import com.tdeauladoze.app.rules.shared.utils.CheckIfSpecialCharacteries;

public class SimpleName {
    private String complete;
    int min = 2;
    int max = 254;


    public SimpleName(String complete) {
        if (this.min > this.max) {
            throw new IllegalArgumentException("Tamanho mínimo não pode ser maior que o maximo");
        }
        if (complete.length() < this.min) {
            throw new IllegalArgumentException(String.format("Nome deve ter no mínimo %d caracteries", this.min));
        }
        if (complete.length() > this.max) {
            throw new IllegalArgumentException(String.format("Nome deve ter no máximo %d caracteries", this.max));
        }

        boolean hasSpecialCharacters = CheckIfSpecialCharacteries.execute(complete);
        if (hasSpecialCharacters) {
            throw new Error("Nome não pode conter caracteries especais");
        }

        this.complete = complete;
    }

    public String getComplete() {
        return this.complete;
    }

    public String getPartial(int amountCharacteries) {
        if (this.complete.length() < amountCharacteries) {
            return this.complete;
        }

        int beginIndex = 0;
        return this.complete.substring(beginIndex, amountCharacteries);
    }
}
