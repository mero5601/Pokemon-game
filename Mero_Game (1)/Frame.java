import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    Drawing draw = new Drawing();
    /*pokemons
        Electric : Pikachu Raichu
        Fire : Charmander Charizard
        Water : Squirtle Blastoise
        Poison : Ekans Arbok
        Normal : Jigglypuff Snorlax
        Rock : Geodude Graveler  */
    private JMenuBar menuBar = new JMenuBar();
    private JMenu pokemons = new JMenu("Pokemons");
    private JMenu abilities = new JMenu("Abilities");
    private JMenuItem attack = new JMenuItem("Attack");
    private JMenuItem evolve = new JMenuItem("Evolve");

    private JMenu electric = new JMenu("Electric");
    private JMenu fire = new JMenu("Fire");
    private JMenu water = new JMenu("Water");
    private JMenu poison = new JMenu("Poison");
    private JMenu normal = new JMenu("Normal");
    private JMenu rock = new JMenu("Rock");
    private JMenuItem pikachu = new JMenuItem("Pikachu");
    private JMenuItem raichu = new JMenuItem("Raichu");
    private JMenuItem charmander = new JMenuItem("Charmander");
    private JMenuItem charizard = new JMenuItem("Charizard");
    private JMenuItem squirtle = new JMenuItem("Squirtle");
    private JMenuItem blastoise = new JMenuItem("Blastoise");
    private JMenuItem ekans = new JMenuItem("Ekans");
    private JMenuItem arbok = new JMenuItem("Arbok");
    private JMenuItem jigglyPuff = new JMenuItem("JigglyPuff");
    private JMenuItem snorlax = new JMenuItem("Snorlax");
    private JMenuItem geodude = new JMenuItem("Geodude");
    private JMenuItem graveler = new JMenuItem("Graveler");
    private JMenu  inventory=new JMenu("Inventory");
    private JMenuItem healthPotion=new JMenuItem("Health potion");
private JMenuItem execution=new JMenuItem("Execute");


    public Frame(String title) {
//Menu
        menuBar.add(pokemons);
        menuBar.add(abilities);
        menuBar.add(inventory);
        //---------------------
        pokemons.add(electric);
        pokemons.add(fire);
        pokemons.add(water);
        pokemons.add(poison);
        pokemons.add(normal);
        pokemons.add(rock);
        electric.add(pikachu);
        electric.add(raichu);
        fire.add(charmander);
        fire.add(charizard);
        water.add(squirtle);
        water.add(blastoise);
        poison.add(ekans);
        poison.add(arbok);
        normal.add(jigglyPuff);
        normal.add(snorlax);
        rock.add(geodude);
        rock.add(graveler);
        abilities.add(attack);
        abilities.add(execution);
        execution.addActionListener(new execution());
        attack.addActionListener(new attacking());
        abilities.add(evolve);
        evolve.addActionListener(new evolvation());
inventory.add(healthPotion);

//action listeners
healthPotion.addActionListener(this);
pikachu.addActionListener(new selection());
        raichu.addActionListener(new selection());
        charmander.addActionListener(new selection());
        charizard.addActionListener(new selection());
        squirtle.addActionListener(new selection());
        blastoise.addActionListener(new selection());
        ekans.addActionListener(new selection());
        arbok.addActionListener(new selection());
        jigglyPuff.addActionListener(new selection());
        snorlax.addActionListener(new selection());
        geodude.addActionListener(new selection());
        graveler.addActionListener(new selection());

        add(menuBar);
        add(draw);

        setJMenuBar(menuBar);
        setTitle(title);
        setSize(1000, 670);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
if (actionEvent.getSource()==healthPotion){
    draw.healing(20);
}
    }
    class  selection implements ActionListener{
        /*pokemons
      Electric : Pikachu Raichu
      Fire : Charmander Charizard
      Water : Squirtle Blastoise
      Poison : Ekans Arbok
      Normal : Jigglypuff Snorlax
      Rock : Geodude Graveler  */
        @Override
        public void actionPerformed(ActionEvent e) {
         if (e.getSource()==pikachu){
             draw.pokimonSelection(1);
         }
         else if (e.getSource()==raichu){
             draw.pokimonSelection(2);

         }
         else if (e.getSource()==charmander){
             draw.pokimonSelection(3);
         }
         else if (e.getSource()==charizard){
             draw.pokimonSelection(4);
         }
         else if (e.getSource()==squirtle){
             draw.pokimonSelection(5);
         }
         else if (e.getSource()==blastoise){
             draw.pokimonSelection(6);
         }
         else if (e.getSource()==ekans){
             draw.pokimonSelection(7);
         }
         else if (e.getSource()==arbok){
             draw.pokimonSelection(8);
         }
         else if (e.getSource()==jigglyPuff){
             draw.pokimonSelection(9);
         }
         else if (e.getSource()==snorlax){
             draw.pokimonSelection(10);
         }
         else if (e.getSource()==geodude){
             draw.pokimonSelection(11);
         }
         else if (e.getSource()==graveler){
             draw.pokimonSelection(12);
         }

        }
    }
    class evolvation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==evolve){
                draw.evolve(1);
            }
        }
    }
    class attacking implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if (e.getSource()==attack){
               draw.attacking();
           }
        }
    }
    class  execution implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==execution){
                draw.executing();
            }
        }
    }

}
