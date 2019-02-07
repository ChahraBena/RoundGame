import javax.swing.*;

/**
 * Created by User on 12/05/2016.
 */
public class PlateauFen extends JFrame {
    public PlateauFen()
    {
        setTitle("PLATEAU");
        setSize(700,700);
        this.setLocationRelativeTo(null);
        this.setContentPane(new plateau());
        this.setVisible(true);
     }
    public static void main(String args[])
    {
        JFrame fen=new PlateauFen();
        fen.setVisible(true);
    }
}
