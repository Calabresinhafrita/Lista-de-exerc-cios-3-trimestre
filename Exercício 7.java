
import java.util.Scanner; import java.util.Locale;
public class Exercicio07 (
public static void main(String[] args) {
Scanner entrada - new Scanner(System.in).useLocale(Locale.US); System.out.print("Primeira nota (0 a 10): ");
double notal = entrada.nextDouble(); System.out.print("Segunda nota (0 a 10): ");
double nota2 - entrada.nextDouble();
if (notal < || notal > 10 || nota2 < 0 || nota2 > 10) { System.out.println("Notas inválidas.");
} else {
double media - (notal + nota2) / 2;
System.out.printf("Média: %.1f%n", media);
entrada.close();
}
}
}
