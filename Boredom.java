package theGame;

import java.awt.EventQueue;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;
//import javax.swing.UIManager;
import javax.swing.JLabel;


//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.SystemColor;
import java.io.File;
import java.awt.Color;


public class Boredom  {

	JFrame frmFrame;
	private JTextField txtGreeter;
	private JButton useless;
	private JButton hiddenButton;
	private JButton prettyGood;
	private JButton activityButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try
				{
				Boredom window = new Boredom();
				window.frmFrame.setVisible(true);
				}
				catch (Exception e) {											
				e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Boredom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		// FRAME
		frmFrame = new JFrame();
		frmFrame.getContentPane().setBackground(SystemColor.menu);
		frmFrame.setResizable(false);
		frmFrame.setTitle("Boredom");
		frmFrame.setBounds(100, 100, 1199, 534);
		frmFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmFrame.getContentPane().setLayout(null);
	

/*
 * J BUTTONS + one TEXTFIELD
 */
		
		
		// STORY BUTTON
		JButton storyButton = new JButton("Story");	
		storyButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent arg0) {						
			txtGreeter.setText(getNextStory());							
			} 													
			
			private String getNextStory() { 
				String[] time = {"Once upon a time...", "A few years ago...", "A few second ago...", "A few minutes ago...", 
				"A few hours ago...", "At this very moment...", "Before the end of the universe,", "In a galaxy far far away,",
				"HEI ESÉ! Tiempo de cuentos!","In a boring world where the concept of dirty jokes doesn't exist:", "Ay lmao m8,",
				"Hideo Kojima presents a triple A story:", "*Insert generic opening here*", "Before the world ended,", "TWEET!TWEET!"};

				String[] names = {" Hank", " Smith", " Johnny", " Marzia", " Maria", " Naomi"};

				String[] actions = {"pimp slapped", "killed", "made love to", "became friends with", "went drinking with", "gave 100 dollars to",
				"hugged", "said hello to", "round house kicked", "revived", "borrowed 100 dollars from", "went jogging with", "disciplined",
				"baked a cake for", "was teaching something to", "liberated an area that belonged to", "pranked", "went bowling with",
				"did not want to take part of this game with", "was stalking","ran away from", "cooked dinner for", "sued", 
				"made vomit cake for", "was blazing with", "*insert something here* with", "was preaching about god to"};
				
				String[] victims = {"Lisa", "Sarah", "Meryl", "Kevin", "David", "Bob"};
				
							
				String result = time[ranGen(time.length)] + names[ranGen(names.length)] + " " +
						actions[ranGen(actions.length)] + " " +
						victims[ranGen(victims.length)] + ", The End";

				 return result;

			}

			private int ranGen(int length){
				return (int) (Math.random() * length);
 
			}

		});
		
		
		// TEXTFIELD
		txtGreeter = new JTextField();
		txtGreeter.setEditable(false);
		txtGreeter.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
		txtGreeter.setHorizontalAlignment(SwingConstants.CENTER);
		txtGreeter.setText("Sup, you wanna procrastinate?");
		txtGreeter.setBounds(10, 11, 1173, 269);
		frmFrame.getContentPane().add(txtGreeter);
		txtGreeter.setColumns(10);
		storyButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		storyButton.setToolTipText("Do it! Just DO IT!");
		storyButton.setBounds(10, 455, 111, 29);
		frmFrame.getContentPane().add(storyButton);						
		
		
		// WORKOUT BUTTON
		JButton workoutButton = new JButton("Workout");
		workoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
			txtGreeter.setText(getNextWorkout());
			}
				
			private String getNextWorkout() { 
				String[] count = {"35", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150"};
					
				String[] activity = {" standing barbell shrugs", " squats", " crunches", " bench presses", " barbell curls", " concentration curls",
				" punches", " pushups", " crunches with legs", " seconds of sprinting", " seconds of front bridge", " overhead presses", " chin ups",
				" seconds of burbee exercise"," minuets of jogging", " squats with extra weight", " seconds of stationary running", " bent rows"};
											
				String result = count[ranGen(count.length)] + 
						activity[ranGen(activity.length)];
					 
				return result;	

				}

				private int ranGen(int length){
					return (int) (Math.random() * length);

				}

		});	
		workoutButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		workoutButton.setToolTipText("Nothing is impossible!");
		workoutButton.setBounds(175, 455, 111, 29);
		frmFrame.getContentPane().add(workoutButton);
		
		
		// ACTIVITY BUTTON
		activityButton = new JButton("Activity");
		activityButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {			
			txtGreeter.setText(getNextActivity());			
			}
			
			private String getNextActivity() { 
				String[] task = {"Hang out with your friends", "Clean your room", "Press this button", "Open your window", "Smile :)",
				"Press the button next to me", "Cook something", "Get a job", "Think about life and your purpose in life", "Eat less",
				"Press the button that generates a random story", "Find something special", "Play a video game", "Do your homework", 
				"Study for your exams if you have any", "Close this window", "Take a nap","Wash the dishes", "Take a shower", "Watch porn", 
				"Listen to music", "Question your holy book", "Drink water", "Rant about something", "Buy a new PC", "Write a book", 
				"Ever thought about doing something on your own?", "Join the USMC to master the art of saying f-ck as many times as possible",
				"Read this line of text while I watch you read this line of text", "Check your mail", "Read the news", "Do not make your bed",
				"Write a book", "Create dank memes", "Flex your muscles infront of a mirror for one hour", "Become a Dark Lord", "Become a kinkin",
				"Practice black magic to summon The Demons of Selzar, OH YEAH!", "Create your own religion and become The Pope of that religion",
				"Eat and smoke at the same time", "Become a professional victim", "Watch a video made by TVFilthyFrank", "Punch your problems to death",
				"Become an anti-racist by being racist twards another race", "Stare at yourself", "Become a hero for fun", "Visit a RedRoom"};

				String result = task[ranGen(task.length)];
				 
				return result;	

			}

			private int ranGen(int length){
				return (int) (Math.random() * length);

			}

		});						
		activityButton.setToolTipText("Don't let your dreams be dreams");
		activityButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		activityButton.setBounds(335, 455, 111, 29);
		frmFrame.getContentPane().add(activityButton);
		
		
		// PRETTY GOOD EASTER EGG BUTTON
		prettyGood = new JButton("");
		prettyGood.setToolTipText("Pretty good");
		prettyGood.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {		
			txtGreeter.setText("You're pretty good"); {
			try
			{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("resources/Jbutton.wav"));
		    Clip clip = AudioSystem.getClip();
		    clip.open(audioInputStream);
		    clip.start();
			}
			catch(Exception ex) {
				ex.printStackTrace( );
			}
			}
		}});
		
				
		// MORON TEST BUTTON
		JButton moronTest = new JButton(":3");
		moronTest.setFont(new Font("Tahoma", Font.PLAIN, 10));
		moronTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			MoronTest.death();
										
		}});										
		moronTest.setToolTipText(":3");
		moronTest.setBounds(20, 290, 89, 14);
		frmFrame.getContentPane().add(moronTest);dd(popup);
		
				
		// CUTE BUTTON		
		JButton cuteButton = new JButton("Cute");
		cuteButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cuteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			CutePopUp.popup();
			}
		});
		
		
		// EASTER EGG BUTTON ONE 
		JButton easterEgg = new JButton("");
		easterEgg.setBackground(SystemColor.menu);
		easterEgg.setToolTipText("Hello");
		easterEgg.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent arg0) {						
			txtGreeter.setText("You found a useless hidden button :D");
			}
		});
		easterEgg.setBounds(10, 490, 45, 5);
		frmFrame.getContentPane().add(easterEgg);
		easterEgg.setBorderPainted(false);
		cuteButton.setBounds(485, 455, 111, 29);
		frmFrame.getContentPane().add(cuteButton);
		prettyGood.setBackground(SystemColor.menu);
		prettyGood.setBounds(812, 435, 24, 14);
		frmFrame.getContentPane().add(prettyGood);				
		prettyGood.setBorderPainted(false);
		
		
		// EASTER EGG BUTTON TWO
		hiddenButton = new JButton("");
		hiddenButton.setBackground(SystemColor.menu);
		hiddenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			txtGreeter.setText("Wana do something? Click the useful button");
			}
		});
		hiddenButton.setToolTipText("Suprise");
		hiddenButton.setBounds(1182, 490, 5, 5);
		hiddenButton.setBorderPainted(false);
		frmFrame.getContentPane().add(hiddenButton);
		
		
		// USELESS BUTTON
		useless = new JButton("");
		useless.setBackground(SystemColor.menu);
		useless.setToolTipText("easter egg");
		useless.setBounds(36, 490, 84, 5);
		useless.setBorderPainted(false);
		frmFrame.getContentPane().add(useless);


/*
 * J LABELS
 */

		
		// INSTRUCTION LABEL
		JLabel lblGuide = new JLabel("Click the buttons bellow");
		lblGuide.setBounds(10, 299, 136, 29);
		frmFrame.getContentPane().add(lblGuide);

		
		// STORY LABEL
		JLabel lblStory = new JLabel("Wanna hear a touching story?");
		lblStory.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblStory.setBounds(10, 435, 145, 14);
		frmFrame.getContentPane().add(lblStory);

		
		// WORKOUT LABEL
		JLabel lblWorkout = new JLabel("Let's make some GAINS!");
		lblWorkout.setFont(new Font("Arial", Font.PLAIN, 10));
		lblWorkout.setBounds(178, 435, 127, 14);
		frmFrame.getContentPane().add(lblWorkout);

		
		// ACTIVITY LABEL
		JLabel lblActivity = new JLabel("Are you bored?");
		lblActivity.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		lblActivity.setBounds(335, 435, 111, 14);
		frmFrame.getContentPane().add(lblActivity);		

		
		// CUTE BUTTON LABEL
		JLabel lblDerp = new JLabel("Derp");
		lblDerp.setForeground(Color.BLACK);
		lblDerp.setFont(new Font("SWTOR Trajan", Font.BOLD | Font.ITALIC, 14));
		lblDerp.setHorizontalAlignment(SwingConstants.CENTER);
		lblDerp.setBounds(485, 430, 111, 24);
		frmFrame.getContentPane().add(lblDerp);
	}
}