public class tabuada {

public static void main (String[] args){
		for (int i = 1; i<=10; i++){
			for (int d = 1; d<=10; d++){
				//System.out.println (i+" x "+ d + " = " + i*d);
                System.out.printf ("%d x %d = %d\n", i, d, i * d); //usando "printf" \n quebra de linha \t -> tabulação

                //%d = inteiro
                //%f = float ou double
                //%s = string
                //%c = char
                //%t = data/hora

			}
		}
	}
}