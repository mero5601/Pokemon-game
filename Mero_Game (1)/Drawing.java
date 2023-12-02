import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drawing extends JComponent implements ActionListener {
    //1000x650 pixels
    ImageIcon backGround = new ImageIcon("C:\\Users\\PC\\Pictures\\Background.JPG");

  private   int hp = 100;
   private String health;
   private String atk="20";
   private   int   attack=20;
    private   int hp2 = 100;
    private String health2;
    private String atk2="20";
    private int attack2=20;
/*pokemons
    Electric : Pikachu Raichu
    Fire : Charmander Charizard
    Water : Squirtle Blastoise
    Poison : Ekans Arbok
    Normal : Jigglypuff Snorlax
    Rock : Geodude Graveler  */
private String execute="Execute (available at 20+ hp)";
    private int random=(int )(Math.random()*11)+1;
    private  ImageIcon squirtle = new ImageIcon("C:\\Users\\PC\\Pictures\\squirtle.PNG");
    private  ImageIcon blastoise = new ImageIcon("C:\\Users\\PC\\Pictures\\Blastoise.JPG");
    private  ImageIcon charmander = new ImageIcon("C:\\Users\\PC\\Pictures\\Charmander.JPG");
    private ImageIcon charizard = new ImageIcon("C:\\Users\\PC\\Pictures\\Charizard.JPG");
    private  ImageIcon arbok = new ImageIcon("C:\\Users\\PC\\Pictures\\Arbok.PNG");
    private ImageIcon jigglyPuff = new ImageIcon("C:\\Users\\PC\\Pictures\\JigglyPuff.JPG");
    private  ImageIcon snorlax = new ImageIcon("C:\\Users\\PC\\Pictures\\Snorlax.JPG");
    private ImageIcon geodude = new ImageIcon("C:\\Users\\PC\\Pictures\\Geodude.JPG");
    private  ImageIcon graveler = new ImageIcon("C:\\Users\\PC\\Pictures\\Graveler.JPG");
    private ImageIcon pikachu = new ImageIcon("C:\\Users\\PC\\Pictures\\Pikachu.JPG");
    private ImageIcon raichu = new ImageIcon("C:\\Users\\PC\\Pictures\\Raichu.PNG");
    private ImageIcon ekans = new ImageIcon("C:\\Users\\PC\\Pictures\\Ekans.JPG");
    private ImageIcon player = new ImageIcon();
    private ImageIcon player2 = new ImageIcon();
    //  String hpBar="Health";


    public void healing(int n) {
        if (hp<=80) {
            hp += 20;
        }
    }
public void evolve(int n){
        if (n==1){
            atk="40";
            attack+=20;
        }


}
public void attacking(){

            hp2-=attack;
            hp-=attack2;
            JOptionPane.showMessageDialog(null, "The enemy has  also attacked you !", "You lost", JOptionPane.OK_OPTION);


}
    public void executing (){
        if (hp2<=30){
            hp2=0;
        }

    }

    public void pokimonSelection(int n) {
        /*pokemons
    Electric : Pikachu Raichu
    Fire : Charmander Charizard
    Water : Squirtle Blastoise
    Poison : Ekans Arbok
    Normal : Jigglypuff Snorlax
    Rock : Geodude Graveler  */
        if (n == 1) {
            player = pikachu;
        } else if (n == 2) {
            player = raichu;
        } else if (n == 3) {
            player = charmander;
        } else if (n == 4) {
                player = charizard;
            } else if (n == 5) {
                player = squirtle;
            } else if (n == 6) {
                player = blastoise;
            } else if (n == 7) {
                player = ekans;
            } else if (n == 8) {
                player = arbok;
            } else if (n == 9) {
                player = jigglyPuff;
            } else if (n == 10) {
                player = snorlax;
            } else if (n == 11) {
                player = geodude;
            } else if (n == 12) {
                player = graveler;
        }

    }

    public void paintComponent(Graphics g) {

        backGround.paintIcon(this, g, 0, 0);
        player.paintIcon(this, g, 20, 200);
        g.setColor(Color.CYAN);
        g.drawString(execute,200,600);
        repaint();
        // blastoise.paintIcon(this,g,200,100);
        g.setColor(Color.yellow);
        g.drawString("Health", 100, 100);
        g.setColor(Color.RED);
        g.drawRect(80, 120, 100, 20);
        //player's health bar
        g.setColor(Color.GREEN);
        if (hp == 100 || hp > 80) {
            g.fillRect(80, 122, 99, 18);
            health="80+";

        } else if (hp >= 70 && hp <= 80) {
            g.fillRect(80, 122, 75, 18);
            health="70+";
        } else if (hp >= 60 && hp < 70) {
            g.fillRect(80, 122, 60, 18);
            health="60+";
        } else if (hp >= 50 && hp < 60) {
            g.fillRect(80, 122, 50, 18);
            health="50+";
        } else if (hp >= 40 && hp < 50) {
            g.fillRect(80, 122, 40, 18);
            health="40+";
        } else if (hp >= 30 && hp < 40) {
            g.fillRect(80, 122, 35, 18);
            health="30+";
        } else if (hp >= 20 && hp < 30) {
            g.fillRect(80, 122, 20, 18);
            health="20+";
  g.drawString("Use health potion in your inventory",100,50);

        } else if (hp >= 10 && hp < 20) {
            g.fillRect(80, 122, 10, 18);
            health="10+";
        } else if (hp < 10) {
            g.fillRect(80, 122, 1, 18);
            JOptionPane.showMessageDialog(null, "Game Over !!!", "You lost", JOptionPane.OK_OPTION);
        }



        //comp pokemon randomizer
        {
            if (random == 1) {
                player2 = pikachu;
            } else if (random == 2) {
                player2 = raichu;
            } else if (random == 3) {
                player2 = charmander;
            } else if (random == 4) {
                player2 = charizard;
            } else if (random == 5) {
                player2 = squirtle;
            } else if (random == 6) {
                player2 = blastoise;
            } else if (random == 7) {
                player2 = ekans;
            } else if (random == 8) {
                player2 = arbok;
            } else if (random == 9) {
                player2 = jigglyPuff;
            } else if (random == 10) {
                player2 = snorlax;
            } else if (random == 11) {
                player2 = geodude;
            } else if (random == 12) {
                player2 = graveler;
            }
        }
        player2.paintIcon(this,g,750,200);


//comp health bar

        g.setColor(Color.GREEN);
        if (hp2 == 100 || hp2 > 80) {
            g.fillRect(750, 122, 99, 18);
            health2="80+";

        } else if (hp2 >= 70 && hp2 <= 80) {
            g.fillRect(750, 122, 75, 18);
            health2="70+";
        } else if (hp2 >= 60 && hp2 < 70) {
            g.fillRect(750, 122, 60, 18);
            health2="60+";
        } else if (hp2 >= 50 && hp2 < 60) {
            g.fillRect(750, 122, 50, 18);
            health2="50+";
        } else if (hp2 >= 40 && hp2 < 50) {
            g.fillRect(750, 122, 40, 18);
            health2="40+";
        } else if (hp2 >= 30 && hp2 < 40) {
            g.fillRect(750, 122, 35, 18);
            health2="30+";
        } else if (hp2 >= 20 && hp2 < 30) {
            g.fillRect(750, 122, 20, 18);
            health2="20+";
        } else if (hp2 >= 10 && hp2 < 20) {
            g.fillRect(750, 122, 10, 18);
            health2="10+";
            g.setColor(Color.RED);

        } else if (hp2 < 10) {
            g.fillRect(750, 122, 1, 18);
          System.exit(0);
         //  JOptionPane.showMessageDialog(null, "You Won!!", "Combat Log", JOptionPane.OK_OPTION);  (Infinite loop!)

        }
        repaint();
        //enemy stats
        g.setColor(Color.RED);
        g.drawRect(750,410,100,100);
        g.drawString("Atk="+atk2,750,450);
        g.drawString("Armor=100%",750,470);
        g.drawString("Health="+health2,760,490);
        g.setColor(Color.GREEN);
        g.drawString("Health", 750, 100);
        g.setColor(Color.RED);
        g.drawRect(750, 120, 100, 20);


//player stats
        g.setColor(Color.white);
        g.drawRect(20,410,100,100);
        g.drawString("Atk="+atk,30,450);
        g.drawString("Armor=100%",30,470);
        g.drawString("Health="+health,30,490);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }


}
