/*
 * Author: Justin Yu
 * Date: 2017-01-23
 * Description: Who Wants to Be a Millionaire (Soccer Edition)
 * GameFinal.java
 */


import java.util.Scanner; // scanner is imported

class GameFinal{ // class
  
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);    
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    Scanner input4 = new Scanner(System.in);
    Scanner input5 = new Scanner(System.in);
    Scanner input6 = new Scanner(System.in);
    Scanner input7 = new Scanner(System.in);
    Scanner input8 = new Scanner(System.in);
    Scanner input9 = new Scanner(System.in);
    Scanner input10 = new Scanner(System.in);
    Scanner input11 = new Scanner(System.in);
    Scanner input12 = new Scanner(System.in);
    String q1;
    String q2;
    String q3;
    String q4;
    String q5;
    String q6;
    String q7;
    String q8;
    String q9;
    String q10;                                    
    String q11;
    String q12;  
    String q13;
    String name;
    String caf=("e) Call A Friend");
    String fiftyfifty =(" f) 50/50 Change");
    String ata=(" g) Ask Anyone");
    int caf1 = 0;
    int fiftyfifty1= 0;
    int ata1 = 0;
    int question;
    int failsafe1;
    int failsafe2;
    int failsafe3;
    int failsafe4;
    int failsafe5;
    int failsafe6;
    int failsafe7;
    int failsafe8;
    int failsafe9;
    int failsafe10;
    int failsafe11;
    int failsafe12;
    int failsafe13;
    failsafe1=0;
    failsafe2=0;
    failsafe3=0;
    failsafe4=0;
    failsafe5=0;
    failsafe6=0;
    failsafe7=0;
    failsafe8=0;
    failsafe9=0;
    failsafe10=0;
    failsafe11=0;
    failsafe12=0;
    failsafe13=0;
    question = 0;
    int ranchoice1 = 0;
    int ranchoice2 = 0;
    int ranchoice3 = 0;
    int ranchoice4 = 0; // variables used in the program
    
    
    System.out.println("Hello what is your name?"); // intro
    name = input.next(); // lets player enter name
    
    
    System.out.println("Welcome " + name +" to Justin's version of Who Wants to Be a Millionaire Soccer Edition.");// Welcome player
    System.out.println("Here are the rules of Who Wants to Be a Millionaire Soccer Edition, they simple tho."); // Introduction
    System.out.println("- If you answer the question correctly you move on to the next question and you recieve money."); // Rules
    System.out.println("- After answering the if you get it correct you can choose to continue to the next round or take the money and dip (Press h)."); // Rules
    System.out.println("- If you answer the question wrong you have to leave.. PCE."); // Rules
    System.out.println("- If you are stuck on a question, you are given 3 lifelines which you can ask a friend to help.");// rules of game 
    System.out.println("You ready??? jk I don't care lets start!");
    
    System.out.println("Amount og money ends here");
    System.out.println("$1000000"); // 1000000 mark
    System.out.println("$500000"); // 500000 mark
    System.out.println("$250000"); // 250000 mark
    System.out.println("$100000"); // 100000 mark
    System.out.println("$50000"); // 50000 mark
    System.out.println("$25000"); // 25000 mark
    System.out.println("$10000"); // 10000 mark
    System.out.println("$5000"); // 5000 mark
    System.out.println("$2000"); // 2000 mark
    System.out.println("$1000"); // 1000 mark
    System.out.println("$500"); // 500 mark
    System.out.println("$200"); // 200 mark
    System.out.println("$100"); // 100 mark
    System.out.println("Amount of money starts here"); // shows player the money and the levels of the game
    do 
      
      
      
      
      
      
// questions start here
    {
      int random_number;//Declare a variable
      random_number = (int)(Math.random( )*15) +1;
      System.out.print(random_number+": ");
      
      if
        (random_number ==1 && failsafe1 != 1)
      {
        {
          System.out.println("If you want to dip with the money type (h)"); // exit
          System.out.println("Where did Gerard Pique sign his first big contract?"); // question
          System.out.println("a) Barcelona b) Liverpool c) Manchester United  d) LA Galaxy "); // options
          System.out.println("Lifelines: ");
          
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata); // shows only lifelines able to use once by player
          
          q1=input1.nextLine();
          
        }
        
        if 
          (q1.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is c)");
          q2=input1.nextLine(); // when player inputs the letter (e) call a friend lifeline is activated 
          caf1++;
        }
        if 
          
          (q1.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & b)");
          fiftyfifty1++;
          q2=input1.nextLine(); // when player inputs the letter (f) 2 correct options is given to the player
        }
        if 
          (q1.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("d): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice2 + "%");
          System.out.println("c): " + ranchoice4 + "%");
          System.out.println("a): " + ranchoice3 + "%");;  // percentage of the correct answer is given if ser inputs letter (g)
          ata1++;
          q2=input1.nextLine();
        }
        if 
          (q1.equals("h"))
        {
          question++; // question counter
          break;
        }
        if 
          (q1.equals("c"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY"); // output if answer is correct
          failsafe2++;
          question++;
        }
        else if 
          (q1.equals("a") || q1.equals("d") || q1.equals("b"))
        {
          System.out.println("Sorry, that is the wrong answer"); // output if answer is incorrect
          break;
        }
      } 
      
      if
        (random_number ==2 && failsafe2 != 1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("What team has been involved in every FIFA World Cup?");
          System.out.println("a) Canada b) Brasil c) U.S.A d) Mexico ");
          System.out.println("Lifelines: ");
          
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          
          q2=input1.nextLine();
          
        }
        
        if 
          (q2.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is b)");
          q2=input1.nextLine();
          caf1++;
        }
        if 
          
          (q2.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & b)");
          fiftyfifty1++;
          q2=input1.nextLine();
        }
        if 
          (q2.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("d): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice4 + "%");
          System.out.println("c): " + ranchoice2 + "%");
          System.out.println("a): " + ranchoice3 + "%");   
          ata1++;
          q2=input1.nextLine();
        }
        if 
          (q2.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q2.equals("b"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe2++;
          question++;
        }
        else if 
          (q2.equals("a") || q2.equals("d") || q2.equals("c"))
        {
          System.out.println("Sorry, that is the wrong answer");
          break;
        }
      } 
      if 
        (random_number ==3 && failsafe3 != 1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("Who won the Champions League in 2015?");
          System.out.println("a) Real Madrid b) Porto c) Barcelona d) PSV ");
          System.out.println("Lifelines: ");
          
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q3=input2.nextLine();
          
        }
        
        if 
          (q3.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is c)");
          q3=input2.nextLine();
          caf1++;
        }
        if 
          (q3.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & a)");
          fiftyfifty1++;
          q3=input2.nextLine(); 
        }
        if 
          (q3.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("d): " + ranchoice1 + "%");
          System.out.println("a): " + ranchoice2 + "%");
          System.out.println("c): " + ranchoice4 + "%");
          System.out.println("b): " + ranchoice3 + "%");  
          ata1++;
          q3=input2.nextLine(); 
        }
        if 
          (q3.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q3.equals("c"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe3++;
          question++;
        }
        else if 
          (q3.equals("a") || q3.equals("d") || q3.equals("b"))
        {
          System.out.println("Sorry, that is the wrong answer");
          break;
        }
      }
      if
        (random_number ==4 && failsafe4 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("What is the oldest football club in history according to FIFA?");
          System.out.println("a)The Football Club of Edinburgh (Scotland) b) TSV 1860 Munchen (Germany) c) Sheffield F.C. (England) d) Melbourne Football Club (Australia) ");
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q4=input3.nextLine();
          
        }
        
        if 
          (q4.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is c)");
          q4=input3.nextLine();
          caf1++;
        }
        if 
          (q4.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & d)");
          fiftyfifty1++;
          q4=input3.nextLine();
        }
        if 
          (q4.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice2 + "%");
          System.out.println("c): " + ranchoice4 + "%");
          System.out.println("d): " + ranchoice3 + "%"); 
          ata1++;
          q4=input3.nextLine();
        }
        if 
          (q4.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q4.equals("c"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe4++;
          question++;
        }
        
        else if 
          (q4.equals("a") || q4.equals("b") || q4.equals("d"))
        {
          System.out.println("Sorry, that is the wrong answer"); 
          break;
        }
      }
      if
        (random_number ==5 && failsafe5 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("What as the name of the first World Cup trophy?");
          System.out.println("a) Jules Rimet trophy b) Rodolphe Seeldrayers trophy c) Daniel Burley Woolfall trophy  d) Arthur Drewry trophy ");
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q5=input4.nextLine();
          
        }
        
        if 
          (q5.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is a)");
          q5=input4.nextLine();
          caf1++;
        }
        if 
          (q5.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & a)");
          fiftyfifty1++;
          q5=input4.nextLine();
        }
        if 
          (q5.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice4 + "%");
          System.out.println("b): " + ranchoice1 + "%");
          System.out.println("c): " + ranchoice2 + "%");
          System.out.println("d): " + ranchoice3 + "%"); 
          ata1++;
          q5=input4.nextLine();
        }
        else if 
          (q5.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q5.equals("a"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe5++;
          question++;
        }
        
        else if 
          (q5.equals("d") || q5.equals("b") || q5.equals("c"))
        {
          System.out.println("Sorry, that is the wrong answer"); 
          break;
        }
      }
      if
        (random_number ==6 && failsafe6 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("What position did Sergio Ramos play during the Galacticos lineup?");
          System.out.println("a) Left Center Back b) Right Center Back c) Left Back d) Right Back ");
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q6=input5.nextLine();
          
        }
        
        if 
          (q6.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is d)");
          q6=input5.nextLine();
          caf1++;
        }
        if 
          (q6.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are a) & d)");
          fiftyfifty1++;
          q6=input5.nextLine();
        }
        if 
          (q6.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice1 + "%"); 
          System.out.println("b): " + ranchoice2 + "%");
          System.out.println("c): " + ranchoice3 + "%");
          System.out.println("d): " + ranchoice4 + "%"); 
          ata1++;
          q6=input5.nextLine();
        }
        else if 
          (q6.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q6.equals("d"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe6++;
          question++;
        }
        
        else if 
          (q6.equals("a") || q6.equals("b") || q6.equals("c"))
        {
          System.out.println("Sorry, that is the wrong answer");
          break;
        }
      }
      if
        (random_number ==7 && failsafe7 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("How many FIFA Ballon d'Ors has Cristiano Ronaldo won?"); 
          System.out.println("a) 1 b) 2 c) 4 d) 6 ");
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q7=input6.nextLine();
          
        }
        
        if 
          (q7.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is b)");
          q7=input6.nextLine();
          caf1++;
        }
        if 
          (q7.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & b)");
          fiftyfifty1++;
          q7=input6.nextLine();
        }
        if 
          (q7.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice4 + "%");
          System.out.println("c): " + ranchoice2 + "%");
          System.out.println("d): " + ranchoice3 + "%"); 
          ata1++;
          q7=input6.nextLine();
        }
        if 
          (q7.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q7.equals("b"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe7++;
          question++;
        }
        
        else if 
          (q7.equals("a") || q7.equals("d") || q7.equals("d"))
        {
          System.out.println("Sorry, that is the wrong answer");  
          break;
        }
      }
      if
        (random_number ==8 && failsafe8 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("What place did Leicester City place in the 2014-15 EPL table?");
          System.out.println("a) 5th b) 17th c) 24th d) 14th" );
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q8=input7.nextLine();
          
        }
        
        if 
          (q8.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is d)");
          q8=input7.nextLine();
          caf1++;          
        }
        if 
          (q8.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are d) & b)");
          fiftyfifty1++;
          q8=input7.nextLine();
        }
        if 
          (q8.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice2 + "%");
          System.out.println("c): " + ranchoice3 + "%");
          System.out.println("d): " + ranchoice4 + "%");
          ata1++;
          q8=input7.nextLine();
        }
        if 
          (q8.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q8.equals("d"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe8++;
          question++;
        }
        
        else if 
          (q8.equals("c") || q8.equals("a") || q8.equals("b"))
        {
          System.out.println("Sorry, that is the wrong answer");   
          break;
        }
      }
      if
        (random_number ==9 && failsafe9 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("What does MLS stand for?");
          System.out.println("a) Major League Soccer b) Minor League Soccer c) Mass League Soccer d) Mean League Soccer");
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q9=input8.nextLine();
          
        }
        
        if 
          (q9.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is a)");
          q9=input8.nextLine();
          caf1++;
        }
        if 
          (q9.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are d) & a)");
          fiftyfifty1++;
          q9=input8.nextLine();
        }
        if 
          (q9.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice4 + "%");
          System.out.println("b): " + ranchoice1 + "%");
          System.out.println("c): " + ranchoice2 + "%");
          System.out.println("d): " + ranchoice3 + "%");  
          ata1++;
          q9=input8.nextLine();
        }
        if 
          (q9.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q9.equals("a"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe9++;
          question++;
        }
        
        else if 
          
          (q9.equals("c") || q9.equals("d") || q9.equals("b"))
          System.out.println("Sorry, that is the wrong answer");       
        break;
      }
      {
      }
      if
        (random_number ==10 && failsafe10 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("Which Country won the 2014 FIFA World Cup?");
          System.out.println("a) Netherland b) Spain c) Germany d) England" );
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q10=input9.nextLine();
          
        }       
        
        if 
          (q10.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is c)");
          q10=input9.nextLine();
          caf1++;
        }
        if 
          (q10.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & a)");
          fiftyfifty1++;
          q10=input9.nextLine();
        }
        if 
          (q10.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice2 + "%");
          System.out.println("c): " + ranchoice4 + "%");
          System.out.println("d): " + ranchoice3 + "%");  
          ata1++;
          q10=input9.nextLine();
        }
        if 
          (q10.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q10.equals("c"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe10++;
          question++;
        }
        else if 
          (q10.equals("a") || q10.equals("d") || q10.equals("b"))
        {
          System.out.println("Sorry, that is the wrong answer"); 
          break;
        }
      }       
      if
        (random_number ==11 && failsafe11 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("Who is the only goalkeeper in history to win the FIFA Ballon d'Ors?");
          System.out.println("a) David Seaman b) Lev Yashin c) Joe Hart d) Justin Yu");
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q11=input10.nextLine();
          
        }
        
        
        if 
          (q11.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is b)");
          q11=input10.nextLine();
          caf1++;
        }
        if 
          (q11.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are b) & d)");
          fiftyfifty1++;
          q11=input10.nextLine();
        }
        if 
          (q11.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice4 + "%");
          System.out.println("c): " + ranchoice2 + "%");
          System.out.println("d): " + ranchoice3 + "%"); 
          ata1++;
          q11=input10.nextLine();
        }
        if 
          (q11.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q11.equals("b"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe11++;
          question++;
        }
        else if 
          (q11.equals("c") || q11.equals("d") || q11.equals("a"))
        {
          System.out.println("Sorry, that is the wrong answer");  
          break;
        }
      }           
      if
        (random_number ==12 && failsafe12 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("What was the score when Arsenal played Manchester United in the FA cup Final in 1979?");
          System.out.println("a) Arsenal 2 Manchester United 3 b) Arsenal 0 Manchester United 2 c) Arsenal 1 Manchester United 0 d) Arsenal 3 Manchester United 2");
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q12=input11.nextLine();
        }
        
        if 
          (q12.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is d)");
          
          q12=input11.nextLine();
          caf1++;
        }
        if 
          (q12.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & d)");
          fiftyfifty1++;
          q12=input11.nextLine();
        }
        if 
          (q12.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice2 + "%");
          System.out.println("c): " + ranchoice3 + "%");
          System.out.println("d): " + ranchoice4 + "%");  
          ata1++;
          q12=input11.nextLine();
        }
        if 
          (q12.equals("h"))
        {
          question++;
          break;
        }
        
        if 
          (q12.equals("d"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe12++;
          question++;
        }
        else if 
          (q12.equals("a") || q12.equals("c") || q12.equals("b"))
        {
          System.out.println("Sorry, that is the wrong answer");  
          break;
        }
      }      
      if
        (random_number ==13 && failsafe13 !=1)
      {
        {
          System.out.println("If you want to dip with the money type (h)");
          System.out.println("How many FIFA Ballon d'Ors has Lionel Messi won?");
          System.out.println("a) 1 b) 2 c) 4 d) 6");
          System.out.println("Lifelines: ");
          if 
          (caf1 != 1 )
          System.out.println(caf);
          
          if 
          (fiftyfifty1 != 1)
          System.out.println(fiftyfifty);
          
          if 
          (ata1 != 1 )
          System.out.println(ata);
          q13=input12.nextLine();
          
        }
        
        
        if 
          (q13.equals("e"))
        {
          System.out.println("e)Call a friend");
          System.out.println("The Answer is c)");
          q13=input12.nextLine();
          failsafe13++;
          caf1++;
        }
        if 
          (q13.equals("f"))
        {
          System.out.println(" f) 50/50");
          System.out.println("Options are c) & b)");
          fiftyfifty1++;
          q13=input12.nextLine();
        }
        if 
          (q13.equals("g"))
        {
          ranchoice1 = 0 + (int)(Math.random()*35);
          ranchoice2 = 0 + (int)(Math.random()*35);
          ranchoice3 = 0 + (int)(Math.random()*35);
          ranchoice4 = 100 - ranchoice1 - ranchoice2 - ranchoice3;
          System.out.println("g) ask anyone");//gives you 4 options to choose from
          System.out.println("Here are the results");
          System.out.println("a): " + ranchoice1 + "%");
          System.out.println("b): " + ranchoice2 + "%");
          System.out.println("c): " + ranchoice4 + "%");
          System.out.println("d): " + ranchoice3 + "%");  
          ata1++;
          q13=input12.nextLine();
        }
        if 
          (q13.equals("h"))
        {
          question++;
          break;
        }
        if 
          (q13.equals("c"))
        {
          System.out.println("Congratulations! You got the correct answer. HOORAY");
          failsafe13++;
          question++;
        }
        else if 
          (q13.equals("b") || q13.equals("d") || q13.equals("a"))
        {
          System.out.println("Sorry, that is the wrong answer"); 
          break;
        }
      }
      // questions end here
    }while (question != 15);
    
    if 
      (question ==0)
      System.out.println("You won nothing at all... hehehe baddie.");//if you got 0 questions right
    else if 
      (question == 1)
      System.out.println("YAY... You won $100!");//only if you got 1 questions right
    
    else if 
      (question == 2)
      System.out.println("YAY... You won $200!!");//only if you got 2 questions right
    else if 
      (question == 3)
      System.out.println("YAY... You won $500!!!!!");//only if you got 2 questions right
    else if 
      (question == 4)
      System.out.println("YAY... You won $1000!!!!!!!!!!");//only if you got 2 questions right
    else if 
      (question == 5)
      System.out.println("YAY... You won $2000!!!!!!!!!!!");//only if you got 2 questions right
    else if 
      (question == 6)
      System.out.println("YAY... You won $5000!!!!!!!!!!!!!");//only if you got 2 questions right
    else if 
      (question == 7)
      System.out.println("YAY... You won $10000!!!!!!!!!!!!!");//only if you got 2 questions right
    else if 
      (question == 8)
      System.out.println("YAY... You won $25000!!!!!!!!!!!!!!");//only if you got 2 questions right
    else if 
      (question == 9)
      System.out.println("YAY... You won $50000!!!!!!!!!!!!!!!");//only if you got 2 questions right
    else if 
      (question == 10)
      System.out.println("YAY... You won $100000!!!!!!!!!!!!!!!!");//only if you got 10 questions right
    else if 
      (question == 11)
      System.out.println("YAY... You won $250000!!!!!!!!!!!!!!!!!");//only if you got 11 questions right
    else if 
      (question == 12)
      System.out.println("YAY... You won $500000!!!!!!!!!!!!!!!!!!!!!!!!!!");//only if you got 12 questions right
    else if 
      (question == 13)
      System.out.println("YAY... You won $1000000!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");//only if you got 13 questions right
    
    input.close();
    input1.close();
    input2.close();
    input3.close();
    input4.close();
    input5.close();
    input6.close();
    input7.close();
    input8.close();
    input9.close();
    input10.close();
    input11.close();
    input12.close();
  }
  
}


