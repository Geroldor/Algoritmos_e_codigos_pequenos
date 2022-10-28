import java.util.Scanner;

class teste{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double x = input.nextDouble();
        extenso(x);
        input.close();
    }

    public static double unidade(double n){
        double un = n%10;
        return un;
    }

    public static double dezena(double n){
        double dez = (n%100)/10;
        return dez;
    }

    public static double centena(double n){
        double cen = (n%1000)/100;
        return cen;
    }

    public static double milhar(double n){
        double mil = (n%10000)/1000;
        return mil;
    }

    public static double dezenacentavo(double n){
        double dezcent = (n%100)/10;
        return dezcent;
    }

    public static double centavos(double n){
        double cent = n%10;
        return cent;
    }

    public static void extenso(double n){
        int un = (int) unidade(n);
        int de = (int) dezena(n);
        int ce = (int) centena(n);
        int mi = (int) milhar(n);
        int dec = (int) dezenacentavo(n);
        int cen = (int) centavos(n);
        String[] unidade = {"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] dezena = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezena2 = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] centena = {"cem", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
        String[] milhar = {"mil", "milhao", "bilhao", "trilhao", "quatrilhao", "quintilhao", "sextilhao", "septilhao", "octilhao", "nonilhao"};
        String[] centavos = {"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] dezenacentavo = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenacentavo2 = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        if(mi != 0){
            System.out.print(milhar[mi-1] + " ");
        }
        if(ce != 0){
            System.out.print(centena[ce] + " ");
        }
        if(de != 0){
            if(de == 1){
                System.out.print(dezena[un] + " ");
            }else{
                System.out.print(dezena2[de-2] + " ");
            }
        }
        if(un != 0){
            System.out.print(unidade[un] + " ");
        }
        if(n > 0){
            System.out.print("reais ");
        }
        if(dec > 0 || cen > 0){
            System.out.print("e ");
            if(dec == 1){
                System.out.print(dezenacentavo[un] + " ");
            }else{
                System.out.print(dezenacentavo2[de-2] + " ");
            }
            if(cen != 0){
                System.out.print(centavos[un] + " ");
            }
                System.out.println("centavos");
        }
    }
}