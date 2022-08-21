package javahora;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class MetodoHoraAtual {

    static boolean verificarHora = false;

    static String horaAtual(int horaInformadas, int minutosInformados) {
        while (true) {
            try {
                String horas = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
                String minutos = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
                System.out.println(horas + ":" + minutos);
                Thread.sleep(1000);
                int horasFormat = Integer.parseInt(horas);
                int minutosFormat = Integer.parseInt(minutos);

                if ((horasFormat == horaInformadas) && (minutosFormat == minutosInformados)) {
                    verificarHora = true;
                    break;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Horário Inválido!");
            }
        }

        return horaInformadas + ":" + minutosInformados;
    }
}
