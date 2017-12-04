/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23.pkg11.pkg17.luca.ciclo.pkgfor.dimmi.la.tua.mail;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class LucaCicloForDimmiLaTuaMail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //il programma permetterà di chiedere tante e-mail all'ingresso per darle poi in segreteria per fare una mail list 
        //fase 1: creare le variabili da utilizzare durante il programma 
        //elenco di mail tipo foglio in cui scrivo sempre a capo la nuova mail
        //lavoro con un foglio di carta gigante e un numero intero per sapere quanto lavoro fare
        String foglio;
        int quanti;
        int ultimi;

        //fase 2: caricamento dei dati  (input) 
        // prima cosa quanto lavoro ovvero quante mail raccolgo
        String tx = JOptionPane.showInputDialog("dimmi quanti mail prendi oggi");
        quanti = Integer.parseInt(tx);
        
        tx = JOptionPane.showInputDialog("quanti sono gli utlimi prima della fine del turno?");
        ultimi = Integer.parseInt(tx);
        
        //chiedo uno alla volta la mail e li inserisco
        //faccio comaprire la finestra per inserire la mail con la domanda dimmi la mail
        //con un JOption
        //cliente1
        foglio = "Registro interessati mail:"; //JOptionPane.showInputDialog("dimmi la mail");

        //fai per n volte la richiesta mail
        for (int i = 0; i < quanti; i++) {
            
           
            

            //richiesta mail
            //cliente2 concateno al primo il secondo arrivato magari andando prima a capo
            foglio += "\n" + (i + 1) + ")" + JOptionPane.showInputDialog("dimmi la mail [" + (i + 1) + " di " + quanti + "]");
            
            //sono pronto per il prossimo ma verifico se avvisare che siano gli ultimi
            //caso sono gli ultimi avvisare con un messaggio
            //se quanti ne ho fatti tolti a quanti ne devo fare e' uguale a ultimi allora avvisare con un messaggio
            
            if (quanti-i-1==ultimi)
            {
                JOptionPane.showMessageDialog(null,"vai a dire che ne mancano solo "+ ultimi + " e poi non ne passo piu'");
            }

        }

        //fase 3: elaborazione dei dati ---> inserirli in ordine alfabetico
        //metto la data
        String data = new Date().toString();
        foglio += "\n" + "Fine elenco." + "\n" + data;
        //fase 4: output dei dati 
        //presento i dati nella finestrella e in console così da poterli copiare e incollare su word

        System.out.println(foglio);
    }

}
