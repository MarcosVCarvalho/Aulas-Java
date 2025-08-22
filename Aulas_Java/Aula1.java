import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;
public class Aula1 {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Resolução da tela é: " + d.width + " X " + d.height);
        Date relogio = new Date();
        System.out.print("A hora é ");
        System.out.println(relogio.toString());
        Locale eu = Locale.getDefault();
        System.out.println("O idioma é " + eu.getDisplayLanguage() + " Eu moro no " + eu.getDisplayCountry());
    }
}
