public enum Valor {
    AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, DAMA, VALETE, REI, CORINGA;

    static Valor[] valuesWithoutCoringa() {
        return new Valor[]{AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, DAMA, VALETE, REI}; // Array sem o valor CORINGA
    }
}
