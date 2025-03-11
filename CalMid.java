import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


/*
JFrame Class
*/
class MyFrame extends JFrame implements ActionListener{
    
    //-------Declaring Checkboxes,Labels,textfields,buttons etc--------
        Container c;
        JCheckBox Dec,Bin,Oct,Hex;
        JCheckBox intt,shrt,loong,byt,flt,dbl;
        JCheckBox add,sub,mul,div,mod,prc,exp,log,ln;
        JCheckBox sin,cos,tan,sec,cosec,cot,sinin,cosin,tanin;
        JCheckBox sinh,cosh,tanh,sech,cosech,coth;
        JCheckBox rtd,dtr;
        
        JLabel num1Label,num2Label,resultLabel,OperandsLabel;
        JTextField num1Field,num2Field,resultField;
        
        JButton Button;
        
        JComboBox Operands;
        public MyFrame(){
        
        c = getContentPane();   //class container for accessing frame and all objects within
        c.setLayout(null);      //null for manual arrangement for Labels
        
        //Label 1
        num1Label = new JLabel("Value 1:");   //Value#1 Label 
        num1Label.setBounds(10,10,600,50);            //setting location
        num1Label.setFont(new Font("Arial",Font.BOLD,15));             //setting font and size
        c.add(num1Label);                               //adding it to the frame
        
        
        //Label 2
        num2Label = new JLabel("Value 2:");        //Value#2 Label (same from Label1)
        num2Label.setBounds(10,15,600,100);
        num2Label.setFont(new Font("Arial",Font.BOLD,15));
        c.add(num2Label);
        
        //Label 3 Result
        resultLabel = new JLabel("Result:");    //Result Label 
        resultLabel.setBounds(10,40,600,150);
        resultLabel.setFont(new Font("Arial",Font.BOLD,15));
        c.add(resultLabel);
        
        OperandsLabel = new JLabel("No of Operands:");                 //No of operands label
        OperandsLabel.setBounds(15,0,300,19);
        OperandsLabel.setFont(new Font("Arial",Font.BOLD,15));
        c.add(OperandsLabel);
        
        //TextFields
        num1Field = new JTextField();     //TextField 1 for Label 1
        num1Field.setBounds(80,20,250,30);
        num1Field.setFont(new Font("Arial",Font.PLAIN,14));
        c.add(num1Field);
        
        num2Field = new JTextField();     //TextField 2 for Label 2
        num2Field.setBounds(80,50,250,30);
        num2Field.setFont(new Font("Arial",Font.PLAIN,14));
        c.add(num2Field);
        
        resultField = new JTextField();     //TextField 3 for Label 3(result)
        resultField.setBounds(80,100,300,30);
        resultField.setFont(new Font("Arial",Font.PLAIN,14));
        c.add(resultField);
        
        //Checkboxes for number systems
        Dec = new JCheckBox("Decimal");      //Decimal CheckBox
        Dec.setBounds(10,160,100,20);
        Dec.setFocusable(false);
        c.add(Dec);
        Dec.addActionListener(this);
        
        Bin = new JCheckBox("Binary");      //Binary CheckBox
        Bin.setBounds(10,180,100,20);
        Bin.setFocusable(false);
        c.add(Bin);
        Bin.addActionListener(this);
        
        Oct = new JCheckBox("Octal");      //Octal CheckBox
        Oct.setBounds(10,200,100,20);
        Oct.setFocusable(false);
        c.add(Oct);
        Oct.addActionListener(this);
        
        Hex = new JCheckBox("Hexadec");      //Hexadecimal CheckBox
        Hex.setBounds(10,220,100,20);
        Hex.setFocusable(false);
        c.add(Hex);
        Hex.addActionListener(this);
        
        //Group button for one selection of checkbox at a time
        ButtonGroup group1 = new ButtonGroup();
        group1.add(Dec);
        group1.add(Bin);
        group1.add(Oct);
        group1.add(Hex);
        
        //Checkboxes for datatypes
        
        intt = new JCheckBox("Int");      //Int CheckBox
        intt.setBounds(170,160,100,20);
        intt.setFocusable(false);
        c.add(intt);
        
        byt = new JCheckBox("Byte");      //Byte CheckBox
        byt.setBounds(170,180,100,20);
        byt.setFocusable(false);
        c.add(byt);
        
        loong = new JCheckBox("Long");      //Long CheckBox
        loong.setBounds(170,200,100,20);
        loong.setFocusable(false);
        c.add(loong);
        
        shrt = new JCheckBox("Short");      //Short CheckBox
        shrt.setBounds(170,220,100,20);
        shrt.setFocusable(false);
        c.add(shrt);
        
        flt = new JCheckBox("Float");      //Float CheckBox
        flt.setBounds(170,240,100,20);
        flt.setFocusable(false);
        c.add(flt);
        
        dbl = new JCheckBox("Double");      //Double CheckBox
        dbl.setBounds(170,260,100,20);
        dbl.setFocusable(false);
        c.add(dbl);
        
        //Button Group for selection of one checkbox at a time
        ButtonGroup group2 = new ButtonGroup();
        group2.add(intt);
        group2.add(shrt);
        group2.add(dbl);
        group2.add(flt);
        group2.add(byt);
        group2.add(loong);
        
        //Checkboxes for arthematic functions
        add = new JCheckBox("+");      //Add CheckBox
        add.setBounds(320,160,100,20);
        add.setFocusable(false);
        c.add(add);
        
        sub = new JCheckBox("-");      //Subtract CheckBox
        sub.setBounds(320,180,100,20);
        sub.setFocusable(false);
        c.add(sub);
        
        mul = new JCheckBox("*");      //Multiply CheckBox
        mul.setBounds(320,200,100,20);
        mul.setFocusable(false);
        c.add(mul);
        
        div = new JCheckBox("/");      //Division CheckBox
        div.setBounds(320,220,100,20);
        div.setFocusable(false);
        c.add(div);
        
        mod = new JCheckBox("%");      //Mod CheckBox
        mod.setBounds(320,240,100,20);
        mod.setFocusable(false);
        c.add(mod);
        
        //Others
        prc = new JCheckBox("%age");      //percentage CheckBox
        prc.setBounds(420,160,100,20);
        prc.setFocusable(false);
        c.add(prc);
        
        exp = new JCheckBox("exp");      //exp CheckBox
        exp.setBounds(420,180,100,20);
        exp.setFocusable(false);
        c.add(exp);
        
        log = new JCheckBox("Log");      //Log CheckBox
        log.setBounds(420,200,100,20);
        log.setFocusable(false);
        c.add(log);
        
        ln = new JCheckBox("ln");      //Natural CheckBox
        ln.setBounds(420,220,100,20);
        ln.setFocusable(false);
        c.add(ln);
        //Trignometric
        
        sin = new JCheckBox("Sin");
        sin.setBounds(10,350,100,20);
        sin.setFocusable(false);
        c.add(sin);
        
        cos = new JCheckBox("Cos");
        cos.setBounds(10,370,100,20);
        cos.setFocusable(false);
        c.add(cos);
        
        tan = new JCheckBox("Tan");
        tan.setBounds(10,390,100,20);
        tan.setFocusable(false);
        c.add(tan);
        
        sec = new JCheckBox("Sec");
        sec.setBounds(10,410,100,20);
        sec.setFocusable(false);
        c.add(sec);
        
        cosec = new JCheckBox("Cosec");
        cosec.setBounds(10,430,100,20);
        cosec.setFocusable(false);
        c.add(cosec);
        
        cot = new JCheckBox("Cot");
        cot.setBounds(10,450,100,20);
        cot.setFocusable(false);
        c.add(cot);
        
        //hyperbolic
        
        sinh = new JCheckBox("Sinh");
        sinh.setBounds(120,350,100,20);
        sinh.setFocusable(false);
        c.add(sinh);
        
        cosh = new JCheckBox("Cosh");
        cosh.setBounds(120,370,100,20);
        cosh.setFocusable(false);
        c.add(cosh);
        
        tanh = new JCheckBox("Tanh");
        tanh.setBounds(120,390,100,20);
        tanh.setFocusable(false);
        c.add(tanh);
        
        sech = new JCheckBox("Sech");
        sech.setBounds(120,410,100,20);
        sech.setFocusable(false);
        c.add(sech);
        
        cosech = new JCheckBox("Cosech");
        cosech.setBounds(120,430,100,20);
        cosech.setFocusable(false);
        c.add(cosech);
        
        coth = new JCheckBox("Coth");
        coth.setBounds(120,450,100,20);
        coth.setFocusable(false);
        c.add(coth);
        
        //inverse
        sinin = new JCheckBox("sin -1");
        sinin.setBounds(240,350,100,20);
        sinin.setFocusable(false);
        c.add(sinin);
        
        cosin = new JCheckBox("cos -1");
        cosin.setBounds(240,370,100,20);
        cosin.setFocusable(false);
        c.add(cosin);
        
        tanin = new JCheckBox("tan -1");
        tanin.setBounds(240,390,100,20);
        tanin.setFocusable(false);
        c.add(tanin);
        
        rtd = new JCheckBox("Rad to Deg");
        rtd.setBounds(340,350,100,20);
        rtd.setFocusable(false);
        c.add(rtd);
        
        dtr = new JCheckBox("Deg to Rad");
        dtr.setBounds(340, 370, 100, 20);
        dtr.setFocusable(false);
        c.add(dtr);
        
        
        //ButtonGroup
        
        ButtonGroup group3 = new ButtonGroup();
        group3.add(add);
        group3.add(sub);
        group3.add(mul);
        group3.add(div);
        group3.add(mod);
        group3.add(prc);
        group3.add(exp);
        group3.add(log);
        group3.add(ln);
        group3.add(sin);
        group3.add(cos);
        group3.add(tan);
        group3.add(sec);
        group3.add(cosec);
        group3.add(cot);
        group3.add(sinin);
        group3.add(cosin);
        group3.add(tanin);
        group3.add(dtr);
        group3.add(rtd);
        group3.add(sinh);
        group3.add(cosh);
        group3.add(tanh);
        group3.add(sech);
        group3.add(cosech);
        group3.add(coth);
       
        
        Dec.setSelected(true);        //by default decimal and double will be selected 
        dbl.setSelected(true);
        
        //One Variable or Two Variable ComboBox
        String[] numbers = {"1","2"};
        Operands = new JComboBox(numbers);
        Operands.setFont(new Font("Arial",Font.BOLD,15));
        Operands.setEditable(false);
        
        Operands.setBounds(150,0,60,20);
        
        
        
        c.add(Operands);
        Operands.setSelectedItem("2");
        Operands.addActionListener(this);
        
        //Someting
        resultField.setEditable(false);
        num2Field.setEnabled(true);
                log.setEnabled(false);
                ln.setEnabled(false);
                sin.setEnabled(false);
                cos.setEnabled(false);
                tan.setEnabled(false);
                sec.setEnabled(false);
                cosec.setEnabled(false);
                cot.setEnabled(false);
                sinin.setEnabled(false);
                cosin.setEnabled(false);
                tanin.setEnabled(false);
                
                sinh.setEnabled(false);
                cosh.setEnabled(false);
                tanh.setEnabled(false);
                sech.setEnabled(false);
                cosech.setEnabled(false);
                coth.setEnabled(false);
                rtd.setEnabled(false);
                dtr.setEnabled(false);
                
                add.setEnabled(true);
                sub.setEnabled(true);
                mul.setEnabled(true);
                div.setEnabled(true);
                mod.setEnabled(true);
                prc.setEnabled(true);
                exp.setEnabled(true);
        
        //Button
        Button = new JButton("=");
        Button.setBounds(400,50,100,50);
        Button.setFocusable(false);
        c.add(Button);
        Button.addActionListener(this);
        }   //Frame
        
        public static boolean isHex(String s)  //check if number is string
        {
            int n = s.length();
 
        
            for (int i = 0; i < n; i++) {
 
            char ch = s.charAt(i);
 
            // Check if the character
            // is invalid
            if ((ch < '0' || ch > '9')
                && (ch < 'A' || ch > 'F')) {
 
                
                return false;
            }
            
            }
            return true;
        }
        
        public static boolean isOctal(int num) //check if number is octal
        {  
            int copy = num;
            
            while(copy!=0)
            {
                if(copy%10>7)
                {
                    return false;
                }
                copy =copy/10;
            }
            return true;        
        }
        
        public static boolean isBinary(int num)   //check if number is binary
        {
            int copy = num;
            
            while(copy!=0)
            {
                if(copy%10>1){
                    return false;
                }
                copy=copy/10;
            }
            return true;
        }
        
        public static boolean isBinary(long num) //check if number is binary for long
        {           
            long copy = num;
            
            while(copy!=0)
            {
                if(copy%10>1){
                    return false;
                }
                copy=copy/10;
            }
            return true;
        } 
        
        public static boolean isOctal(long num)  //check for long octal
        {   
            long copy = num;
            
            while(copy!=0)
            {
                if(copy%10>7)
                {
                    return false;
                }
                copy =copy/10;
            }
            return true;   
        }
        
        public void actionPerformed(ActionEvent e)   //implementing action on the buttons,checkboxes etc
        {
        
        try{ 
         
          if(Operands.getSelectedItem()=="2")
            {
                num2Field.setEditable(true);
                num2Field.setEnabled(true);
                log.setEnabled(false);
                ln.setEnabled(false);
                sin.setEnabled(false);
                cos.setEnabled(false);
                tan.setEnabled(false);
                sec.setEnabled(false);
                cosec.setEnabled(false);
                cot.setEnabled(false);
                sinin.setEnabled(false);
                cosin.setEnabled(false);
                tanin.setEnabled(false);
                rtd.setEnabled(false);
                dtr.setEnabled(false);
                
                sinh.setEnabled(false);
                cosh.setEnabled(false);
                tanh.setEnabled(false);
                sech.setEnabled(false);
                cosech.setEnabled(false);
                coth.setEnabled(false);
                
                
                add.setEnabled(true);
                sub.setEnabled(true);
                mul.setEnabled(true);
                div.setEnabled(true);
                mod.setEnabled(true);
                prc.setEnabled(true);
                exp.setEnabled(true);
                
                intt.setEnabled(true);
                byt.setEnabled(true);
                loong.setEnabled(true);
                shrt.setEnabled(true);
                flt.setEnabled(true);
                dbl.setEnabled(true);
                
                Bin.setEnabled(true);
                Oct.setEnabled(true);
                Hex.setEnabled(true);
                
            if(Dec.isSelected())
            {    if(intt.isSelected())
                    {
                        if(add.isSelected())
                        {
                           int x,y,z;
                           if(e.getSource()==Button){
                           x = Integer.parseInt(num1Field.getText());
                           y = Integer.parseInt(num2Field.getText());
                           z = (int)(x+y);
                           resultField.setText(Integer.toString(z));
                        }}
                        else if(sub.isSelected()){
                           int x,y,z;
                           if(e.getSource()==Button){
                           x = Integer.parseInt(num1Field.getText());
                           y = Integer.parseInt(num2Field.getText());
                           z = (int)(x-y);
                           resultField.setText(Integer.toString(z));
                    
                    }}
                        else if(mul.isSelected()){
                           int x,y,z;
                           if(e.getSource()==Button){
                           x = Integer.parseInt(num1Field.getText());
                           y = Integer.parseInt(num2Field.getText());
                           z = (int)(x*y);
                           resultField.setText(Integer.toString(z));
                    
                    }}
                        else if(div.isSelected()){
                           int x,y,z;
                           if(e.getSource()==Button){
                           x = Integer.parseInt(num1Field.getText());
                           y = Integer.parseInt(num2Field.getText());
                           z = (int)(x/y);
                           if (y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Integer.toString(z));
                    
                    }}
                        else if(mod.isSelected()){
                           int x,y,z;
                           if(e.getSource()==Button){
                           x = Integer.parseInt(num1Field.getText());
                           y = Integer.parseInt(num2Field.getText());
                           z = (int)(x%y);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Integer.toString(z));
                    
                    }}
                        else if(prc.isSelected()){
                           int x,y,z;
                           if(e.getSource()==Button){
                           x = Integer.parseInt(num1Field.getText());
                           y = Integer.parseInt(num2Field.getText());
                           z = (int)((x/y)*100);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                           resultField.setText(Integer.toString(z));
                    
                    }}
                        else if(exp.isSelected()){
                           int x,y,z;
                           if(e.getSource()==Button){
                           x = Integer.parseInt(num1Field.getText());
                           y = Integer.parseInt(num2Field.getText());
                           z = (int)(Math.pow(x, y));
                           resultField.setText(x+"^"+y+"="+Integer.toString(z));
                    
                    
                    }}
                    }
                
                    if(flt.isSelected())
                        {
                        if(add.isSelected())
                        {
                           float x,y,z;
                           if(e.getSource()==Button){
                           x = Float.parseFloat(num1Field.getText());
                           y = Float.parseFloat(num2Field.getText());
                           z = (float)(x+y);
                           resultField.setText(Float.toString(z));
                        }}
                        else if(sub.isSelected()){
                           float x,y,z;
                           if(e.getSource()==Button){
                           x = Float.parseFloat(num1Field.getText());
                           y = Float.parseFloat(num2Field.getText());
                           z = (float)(x-y);
                           resultField.setText(Float.toString(z));
                    
                    }}
                        else if(mul.isSelected()){
                           float x,y,z;
                           if(e.getSource()==Button){
                           x = Float.parseFloat(num1Field.getText());
                           y = Float.parseFloat(num2Field.getText());
                           z = (float)(x*y);
                           resultField.setText(Float.toString(z));
                    
                    }}
                        else if(div.isSelected()){
                           float x,y,z;
                           if(e.getSource()==Button){
                           x = Float.parseFloat(num1Field.getText());
                           y = Float.parseFloat(num2Field.getText());
                           z = (float)(x/y);
                           if (y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Float.toString(z));
                    
                    }}
                        else if(mod.isSelected()){
                           float x,y,z;
                           if(e.getSource()==Button){
                           x = Float.parseFloat(num1Field.getText());
                           y = Float.parseFloat(num2Field.getText());
                           z = (float)(x%y);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Float.toString(z));
                    
                    }}
                        else if(prc.isSelected()){
                           float x,y,z;
                           if(e.getSource()==Button){
                           x = Float.parseFloat(num1Field.getText());
                           y = Float.parseFloat(num2Field.getText());
                           z = (float)((x/y)*100);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                           resultField.setText(Float.toString(z));
                    
                    }}
                        else if(exp.isSelected()){
                           float x,z;
                           float y;
                           if(e.getSource()==Button){
                           x = Float.parseFloat(num1Field.getText());
                           y = Float.parseFloat(num2Field.getText());
                           z = (float)(Math.pow(x, y));
                           resultField.setText(x+"^"+y+"="+Float.toString(z));
                    
                    
                    }}
                            
                            }
                if (dbl.isSelected()){
                        if(add.isSelected())
                        {
                           double x,y,z;
                           if(e.getSource()==Button){
                           x = Double.parseDouble(num1Field.getText());
                           y = Double.parseDouble(num2Field.getText());
                           z = (double)(x+y);
                           resultField.setText(Double.toString(z));
                        }}
                    else if(sub.isSelected()){
                           double x,y,z;
                           if(e.getSource()==Button){
                           x = Double.parseDouble(num1Field.getText());
                           y = Double.parseDouble(num2Field.getText());
                           z = (double)(x-y);
                           resultField.setText(Double.toString(z));
                    
                    }}
                    else if(mul.isSelected()){
                           double x,y,z;
                           if(e.getSource()==Button){
                           x = Double.parseDouble(num1Field.getText());
                           y = Double.parseDouble(num2Field.getText());
                           z = (double)(x*y);
                           resultField.setText(Double.toString(z));
                    
                    }}
                    else if(div.isSelected()){
                           double x,y,z;
                           if(e.getSource()==Button){
                           x = Double.parseDouble(num1Field.getText());
                           y = Double.parseDouble(num2Field.getText());
                           z = (double)(x/y);
                           if (y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Double.toString(z));
                    
                    }}
                    else if(mod.isSelected()){
                           double x,y,z;
                           if(e.getSource()==Button){
                           x = Double.parseDouble(num1Field.getText());
                           y = Double.parseDouble(num2Field.getText());
                           z = (double)(x%y);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Double.toString(z));
                    
                    }}
                    else if(prc.isSelected()){
                           double x,y,z;
                           if(e.getSource()==Button){
                           x = Double.parseDouble(num1Field.getText());
                           y = Double.parseDouble(num2Field.getText());
                           z = (double)((x/y)*100);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                           resultField.setText(Double.toString(z));
                    
                    }}
                    else if(exp.isSelected()){
                           double x,z;
                           double y;
                           if(e.getSource()==Button){
                           x = Double.parseDouble(num1Field.getText());
                           y = Double.parseDouble(num2Field.getText());
                           z = (double)(Math.pow(x, y));
                           resultField.setText(x+"^"+y+"="+Double.toString(z));
                    
                    
                    }}
                    
                    }
                if(byt.isSelected()){
                    if(add.isSelected())
                        {
                           byte x,y,z;
                           if(e.getSource()==Button){
                           x = Byte.parseByte(num1Field.getText());
                           y = Byte.parseByte(num2Field.getText());
                           z = (byte)(x+y);
                           resultField.setText(Byte.toString(z));
                        }}
                    else if(sub.isSelected()){
                           byte x,y,z;
                           if(e.getSource()==Button){
                           x = Byte.parseByte(num1Field.getText());
                           y = Byte.parseByte(num2Field.getText());
                           z = (byte)(x-y);
                           resultField.setText(Byte.toString(z));
                    
                    }}
                    else if(mul.isSelected()){
                           byte x,y,z;
                           if(e.getSource()==Button){
                           x = Byte.parseByte(num1Field.getText());
                           y = Byte.parseByte(num2Field.getText());
                           z = (byte)(x*y);
                           resultField.setText(Byte.toString(z));
                    
                    }}
                    else if(div.isSelected()){
                           byte x,y,z;
                           if(e.getSource()==Button){
                           x = Byte.parseByte(num1Field.getText());
                           y = Byte.parseByte(num2Field.getText());
                           z = (byte)(x/y);
                           if (y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Byte.toString(z));
                    
                    }}
                    else if(mod.isSelected()){
                           byte x,y,z;
                           if(e.getSource()==Button){
                           x = Byte.parseByte(num1Field.getText());
                           y = Byte.parseByte(num2Field.getText());
                           z = (byte)(x%y);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Byte.toString(z));
                    
                    }}
                    else if(prc.isSelected()){
                           byte x,y,z;
                           if(e.getSource()==Button){
                           x = Byte.parseByte(num1Field.getText());
                           y = Byte.parseByte(num2Field.getText());
                           z = (byte)((x/y)*100);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                           resultField.setText(Byte.toString(z));
                    
                    }}
                    else if(exp.isSelected()){
                           byte x,y,z;
                           if(e.getSource()==Button){
                           x = Byte.parseByte(num1Field.getText());
                           y = Byte.parseByte(num2Field.getText());
                           z = (byte)(Math.pow(x, y));
                           resultField.setText(x+"^"+y+"="+Byte.toString(z));
                    
                    
                    }}
                    }
            if (shrt.isSelected())
            {
                    if(add.isSelected())
                        {
                           short x,y,z;
                           if(e.getSource()==Button){
                           x = Short.parseShort(num1Field.getText());
                           y = Short.parseShort(num2Field.getText());
                           z = (short)(x+y);
                           resultField.setText(Short.toString(z));
                        }}
                    else if(sub.isSelected()){
                           short x,y,z;
                           if(e.getSource()==Button){
                           x = Short.parseShort(num1Field.getText());
                           y = Short.parseShort(num2Field.getText());
                           z = (short)(x-y);
                           resultField.setText(Short.toString(z));
                    
                    }}
                    else if(mul.isSelected()){
                           short x,y,z;
                           if(e.getSource()==Button){
                           x = Short.parseShort(num1Field.getText());
                           y = Short.parseShort(num2Field.getText());
                           z = (short)(x*y);
                           resultField.setText(Short.toString(z));
                    
                    }}
                    else if(div.isSelected()){
                           short x,y,z;
                           if(e.getSource()==Button){
                           x = Short.parseShort(num1Field.getText());
                           y = Short.parseShort(num2Field.getText());
                           z = (short)(x/y);
                           if (y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Short.toString(z));
                    
                    }}
                    else if(mod.isSelected()){
                           short x,y,z;
                           if(e.getSource()==Button){
                           x = Short.parseShort(num1Field.getText());
                           y = Short.parseShort(num2Field.getText());
                           z = (short)(x%y);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Short.toString(z));
                    
                    }}
                    else if(prc.isSelected()){
                           short x,y,z;
                           if(e.getSource()==Button){
                           x = Short.parseShort(num1Field.getText());
                           y = Short.parseShort(num2Field.getText());
                           z = (short)((x/y)*100);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                           resultField.setText(Short.toString(z));
                    
                    }}
                    else if(exp.isSelected()){
                           short x,y,z;
                           if(e.getSource()==Button){
                           x = Short.parseShort(num1Field.getText());
                           y = Short.parseShort(num2Field.getText());
                           z = (short)(Math.pow(x, y));
                           resultField.setText(x+"^"+y+"="+Short.toString(z));
                    
                    
                    }}
            
            }
            if(loong.isSelected()){
                        if(add.isSelected())
                        {
                           long x,y,z;
                           if(e.getSource()==Button){
                           x = Long.parseLong(num1Field.getText());
                           y = Long.parseLong(num2Field.getText());
                           z = (long)(x+y);
                           resultField.setText(Long.toString(z));
                        }}
                    else if(sub.isSelected()){
                           long x,y,z;
                           if(e.getSource()==Button){
                           x = Long.parseLong(num1Field.getText());
                           y = Long.parseLong(num2Field.getText());
                           z = (long)(x-y);
                           resultField.setText(Long.toString(z));
                    
                    }}
                    else if(mul.isSelected()){
                           long x,y,z;
                           if(e.getSource()==Button){
                           x = Long.parseLong(num1Field.getText());
                           y = Long.parseLong(num2Field.getText());
                           z = (long)(x*y);
                           resultField.setText(Long.toString(z));
                    
                    }}
                    else if(div.isSelected()){
                           long x,y,z;
                           if(e.getSource()==Button){
                           x = Long.parseLong(num1Field.getText());
                           y = Long.parseLong(num2Field.getText());
                           z = (long)(x/y);
                           if (y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Long.toString(z));
                    
                    }}
                    else if(mod.isSelected()){
                           long x,y,z;
                           if(e.getSource()==Button){
                           x = Long.parseLong(num1Field.getText());
                           y = Long.parseLong(num2Field.getText());
                           z = (long)(x%y);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                               resultField.setText(Long.toString(z));
                    
                    }}
                    else if(prc.isSelected()){
                           long x,y,z;
                           if(e.getSource()==Button){
                           x = Long.parseLong(num1Field.getText());
                           y = Long.parseLong(num2Field.getText());
                           z = (long)((x/y)*100);
                           if(y==0)
                               resultField.setText("Error:Divisor cannot be zero");
                           else
                           resultField.setText(Long.toString(z));
                    
                    }}
                    else if(exp.isSelected()){
                           long x,y,z;
                           if(e.getSource()==Button){
                           x = Long.parseLong(num1Field.getText());
                           y = Long.parseLong(num2Field.getText());
                           z = (long)(Math.pow(x, y));
                           resultField.setText(x+"^"+y+"="+Long.toString(z));
                    
                           
                    }}
            
            }
            }
            if(Bin.isSelected())
            {     
                
                dbl.setEnabled(false);
                shrt.setEnabled(false);
                loong.setEnabled(true);
                flt.setEnabled(false);
                byt.setEnabled(false);
                prc.setEnabled(false);
                exp.setEnabled(false);
                
                  int x,y;
                  long x1,y1;
                  if(intt.isSelected())
                  { 
                      
                      x = Integer.parseInt(num1Field.getText());
                      y = Integer.parseInt(num2Field.getText());
                      
                      if(isBinary(x)==true && isBinary(y)==true){
                          if(add.isSelected())
                          { if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),2);
                              int b = Integer.parseInt(num2Field.getText(),2);
                              int c = (int)(a+b);
                              resultField.setText(Integer.toBinaryString(c));
                              
                          }}
                          if(sub.isSelected())
                          { if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),2);
                              int b = Integer.parseInt(num2Field.getText(),2);
                              int c = (int)(a-b);
                              resultField.setText(Integer.toBinaryString(c));
                          
                          }}
                          if(mul.isSelected())
                          { if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),2);
                              int b = Integer.parseInt(num2Field.getText(),2);
                              int c = (int)(a*b);
                              resultField.setText(Integer.toBinaryString(c));
                              
                          }}
                          if(div.isSelected())
                          { if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),2);
                              int b = Integer.parseInt(num2Field.getText(),2);
                              int c = (int) (a/b);
                              
                              resultField.setText(Integer.toBinaryString(c));
                              
                              
                          }}
                          if(mod.isSelected())
                          { if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),2);
                              int b = Integer.parseInt(num2Field.getText(),2);
                              int c = (int) (a%b);
                              
                              resultField.setText(Integer.toBinaryString(c));
                          
                          }}
                          
                          
                      }
                      else
                          resultField.setText("Error: Input is not binary");
                  }
                  
                  if(loong.isSelected())
                  { 
                      x1 = Long.parseLong(num1Field.getText());
                      y1 = Long.parseLong(num2Field.getText());
                      
                      if(isBinary(x1)==true && isBinary(y1)==true){
                          if(add.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),2);
                              long b = Long.parseLong(num2Field.getText(),2);
                              long c = (long)(a+b);
                              resultField.setText(Long.toBinaryString(c));
                              
                          }}
                          if(sub.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),2);
                              long b = Long.parseLong(num2Field.getText(),2);
                              long c = (long)(a-b);
                              resultField.setText(Long.toBinaryString(c));
                          
                          }}
                          if(mul.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),2);
                              long b = Long.parseLong(num2Field.getText(),2);
                              long c = (long)(a*b);
                              resultField.setText(Long.toBinaryString(c));
                              
                          }}
                          if(div.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),2);
                              long b = Long.parseLong(num2Field.getText(),2);
                              long c = (long) (a/b);
                              
                              resultField.setText(Long.toBinaryString(c));
                              
                              
                          }}
                          if(mod.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),2);
                              long b = Long.parseLong(num2Field.getText(),2);
                              long c = (long) (a%b);
                              
                              resultField.setText(Long.toBinaryString(c));
                          
                          }}
                          
                          
                      }
                      else
                          resultField.setText("Error: Input is not binary");
                  }
            }
            if(Oct.isSelected())
            {   
                dbl.setEnabled(false);
                shrt.setEnabled(false);
                loong.setEnabled(true);
                flt.setEnabled(false);
                byt.setEnabled(false);
                prc.setEnabled(false);
                exp.setEnabled(false);
                int x,y;
                long x1,y1;
                  if(intt.isSelected())
                  { 
                      x = Integer.parseInt(num1Field.getText());
                      y = Integer.parseInt(num2Field.getText());
                      
                      if(isOctal(x)==true && isOctal(y)==true)
                      {
                          if(add.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),8);
                              int b = Integer.parseInt(num2Field.getText(),8);
                              int c = (int)(a+b);
                              resultField.setText(Integer.toOctalString(c));
                          }}
                          if(sub.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),8);
                              int b = Integer.parseInt(num2Field.getText(),8);
                              int c = (int)(a-b);
                              resultField.setText(Integer.toOctalString(c));
                          
                          }}
                          if(mul.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),8);
                              int b = Integer.parseInt(num2Field.getText(),8);
                              int c = (int)(a*b);
                              resultField.setText(Integer.toOctalString(c));
                              
                          }}
                          if(div.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),8);
                              int b = Integer.parseInt(num2Field.getText(),8);
                              if (b!=0){
                              int c = (int)(a/b);
                              
                              resultField.setText(Integer.toOctalString(c));
                              }
                              else
                                  resultField.setText("Error:Divisor cannot be zero");
                          }}
                          if(mod.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),8);
                              int b = Integer.parseInt(num2Field.getText(),8);
                              if(b!=0){
                              int c = (int)(a%b);
                              resultField.setText(Integer.toOctalString(c));
                              }
                              else
                                  resultField.setText("Error:Divisor cannot be zero");
                          }}
                      }
                      else
                          resultField.setText("Error:One of the inputs is not octal.");
                  
                  }
                  if(loong.isSelected())
                  { 
                      x1 = Long.parseLong(num1Field.getText());
                      y1 = Long.parseLong(num2Field.getText());
                      
                      if(isOctal(x1)==true && isOctal(y1)==true){
                          if(add.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),8);
                              long b = Long.parseLong(num2Field.getText(),8);
                              long c = (long)(a+b);
                              resultField.setText(Long.toOctalString(c));
                              
                          }}
                          if(sub.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),8);
                              long b = Long.parseLong(num2Field.getText(),8);
                              long c = (long)(a-b);
                              resultField.setText(Long.toOctalString(c));
                          
                          }}
                          if(mul.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),8);
                              long b = Long.parseLong(num2Field.getText(),8);
                              long c = (long)(a*b);
                              resultField.setText(Long.toOctalString(c));
                              
                          }}
                          if(div.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),8);
                              long b = Long.parseLong(num2Field.getText(),8);
                              long c = (long) (a/b);
                              
                              resultField.setText(Long.toOctalString(c));
                              
                              
                          }}
                          if(mod.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),8);
                              long b = Long.parseLong(num2Field.getText(),8);
                              long c = (long) (a%b);
                              
                              resultField.setText(Long.toOctalString(c));
                          
                          }}
                          
                          
                      }
                      else
                          resultField.setText("Error: Input is not octal");
                  }
                
            }
            if(Hex.isSelected())
            {   
                 dbl.setEnabled(false);
                shrt.setEnabled(false);
                loong.setEnabled(true);
                flt.setEnabled(false);
                byt.setEnabled(false);
                prc.setEnabled(false);
                exp.setEnabled(false);
                String x,y;
                  if(intt.isSelected())
                  { 
                      x = num1Field.getText();
                      y = num2Field.getText();
                      
                      if(isHex(x)==true && isHex(y)==true)
                      {
                             if(add.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),16);
                              int b = Integer.parseInt(num2Field.getText(),16);
                              int c = (int)(a+b);
                              resultField.setText(Integer.toHexString(c).toUpperCase());
                          }}
                          if(sub.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),16);
                              int b = Integer.parseInt(num2Field.getText(),16);
                              int c = (int)(a-b);
                              resultField.setText(Integer.toHexString(c).toUpperCase());
                          
                          }}
                          if(mul.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),16);
                              int b = Integer.parseInt(num2Field.getText(),16);
                              int c = (int)(a*b);
                              resultField.setText(Integer.toHexString(c).toUpperCase());
                              
                          }}
                          if(div.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),16);
                              int b = Integer.parseInt(num2Field.getText(),16);
                              if (b!=0){
                              int c = (int)(a/b);
                              
                              resultField.setText(Integer.toHexString(c).toUpperCase());
                              }
                              else
                                  resultField.setText("Error:Divisor cannot be zero");
                          }}
                          if(mod.isSelected())
                          {if(e.getSource()==Button){
                              int a = Integer.parseInt(num1Field.getText(),16);
                              int b = Integer.parseInt(num2Field.getText(),16);
                              if(b!=0){
                              int c = (int)(a%b);
                              resultField.setText(Integer.toHexString(c).toUpperCase());
                              }
                              else
                                  resultField.setText("Error:Divisor cannot be zero");
                          }}
                      }
                      else
                          resultField.setText("Error:One of the inputs is not hexadecimal");
                  }
                    if(loong.isSelected())
                  { 
                      String x1 = num1Field.getText();
                      String y1 = num2Field.getText();
                      
                      if(isHex(x1)==true && isHex(y1)==true){
                          if(add.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),16);
                              long b = Long.parseLong(num2Field.getText(),16);
                              long c = (long)(a+b);
                              resultField.setText(Long.toHexString(c).toUpperCase());
                              
                          }}
                          if(sub.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),16);
                              long b = Long.parseLong(num2Field.getText(),16);
                              long c = (long)(a-b);
                              resultField.setText(Long.toHexString(c).toUpperCase());
                          
                          }}
                          if(mul.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),16);
                              long b = Long.parseLong(num2Field.getText(),16);
                              long c = (long)(a*b);
                              resultField.setText(Long.toHexString(c).toUpperCase());
                              
                          }}
                          if(div.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),16);
                              long b = Long.parseLong(num2Field.getText(),16);
                              long c = (long) (a/b);
                              
                              resultField.setText(Long.toHexString(c).toUpperCase());
                              
                              
                          }}
                          if(mod.isSelected())
                          {if(e.getSource()==Button){
                              long a = Long.parseLong(num1Field.getText(),16);
                              long b = Long.parseLong(num2Field.getText(),16);
                              long c = (long) (a%b);
                              
                              resultField.setText(Long.toHexString(c).toUpperCase());
                          
                          }}
                          
                          
                      }
                      else
                          resultField.setText("Error: Input(s) is not Hexadecimal");
                  }
                  
            
            }
                    
                    
        }
          else
          {     
                Dec.setSelected(true);
                dbl.setSelected(true);
                dbl.setEnabled(true);
                num2Field.setEnabled(false);
                rtd.setEnabled(true);
                dtr.setEnabled(true);
                add.setEnabled(false);
                sub.setEnabled(false);
                mul.setEnabled(false);
                div.setEnabled(false);
                mod.setEnabled(false);
                prc.setEnabled(false);
                exp.setEnabled(false);
                num2Field.setEditable(false);
                log.setEnabled(true);
                ln.setEnabled(true);
                sin.setEnabled(true);
                cos.setEnabled(true);
                tan.setEnabled(true);
                sec.setEnabled(true);
                cosec.setEnabled(true);
                cot.setEnabled(true);
                sinin.setEnabled(true);
                cosin.setEnabled(true);
                tanin.setEnabled(true);
                //secin.setEnabled(true);
                //cosecin.setEnabled(true);
                //cotin.setEnabled(true);
                sinh.setEnabled(true);
                cosh.setEnabled(true);
                tanh.setEnabled(true);
                sech.setEnabled(true);
                cosech.setEnabled(true);
                coth.setEnabled(true);
                //sinhin.setEnabled(true);
                //coshin.setEnabled(true);
                //tanhin.setEnabled(true);
                //sechin.setEnabled(true);
                //cosechin.setEnabled(true);
                //cothin.setEnabled(true);
                Bin.setEnabled(false);
                Oct.setEnabled(false);
                Hex.setEnabled(false);
                
                if(Dec.isSelected())
                {   
                    intt.setEnabled(false);
                    shrt.setEnabled(false);
                    loong.setEnabled(false);
                    byt.setEnabled(false);
                    flt.setEnabled(false);
                    
                    if(dbl.isSelected())
                    {
                      if(rtd.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Double.parseDouble(num1Field.getText());
                      y=(double) Math.toDegrees(x);
                      resultField.setText(Double.toString(y));
                      }
                      
                      }
                      if(dtr.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Double.parseDouble(num1Field.getText());
                      y=(double) Math.toRadians(x);
                      resultField.setText(Double.toString(y));
                      }
                      
                      
                      }
                      if(log.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Double.parseDouble(num1Field.getText());
                      y = (double) Math.log(x);
                      resultField.setText(Double.toString(y));
                      }}
                      else if(ln.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Double.parseDouble(num1Field.getText());
                      y = (double) Math.log1p(x);
                      resultField.setText(Double.toString(y));
                      
                      }}
                      else if(sin.isSelected()){
                      resultField.setText("Enter a value in radians");
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      
                      y = (double) Math.sin(x);
                      resultField.setText(Double.toString(y));
                      
                      }}
                      else if(cos.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      y = (double) Math.cos(x);
                      resultField.setText(Double.toString(y));

                      }}
                      else if(tan.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      y = (double) Math.tan(x);
                      resultField.setText(Double.toString(y));

                      
                      }}
                      else if(sec.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      y = (double) (1/(Math.cos(x)));
                      resultField.setText(Double.toString(y));

                      }}
                      else if(cosec.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      y = (double) (1/(Math.sin(x)));
                      resultField.setText(Double.toString(y));
                      }}
                      else if(cot.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      y = (double) (1/(Math.tan(x)));
                      resultField.setText(Double.toString(y));
                      
                      }}
                      else if(sinin.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      if(x>=-1 && x<=1){
                      y = (double) (Math.asin(x));
                      resultField.setText(Double.toString(y));
                      }
                      else
                          resultField.setText("Enter valid number");
                      }}
                      else if(cosin.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      if(x>=-1 && x<=1){
                      y = (double) (Math.acos(x));
                      resultField.setText(Double.toString(y));
                      }
                      else
                          resultField.setText("Enter valid number");
                      }}
                      else if(tanin.isSelected()){
                      double x,y;
                      if(e.getSource()==Button){
                      x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                      y = (double) (Math.atan(x));
                      resultField.setText(Double.toString(y));
                      
                      }}
                      
                      else if(sinh.isSelected()){
                        double x,y;
                        if(e.getSource()==Button){
                        x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                        y = (double) (Math.sinh(x));
                        resultField.setText(Double.toString(y));
                      
                      }}
                      else if(cosh.isSelected()){
                        double x,y;
                        if(e.getSource()==Button){
                        x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                        y = (double) (Math.cosh(x));
                        resultField.setText(Double.toString(y));
                      
                      }}
                      else if(tanh.isSelected()){
                        double x,y;
                        if(e.getSource()==Button){
                        x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                        y = (double) (Math.tanh(x));
                        resultField.setText(Double.toString(y));
                      
                      }}
                      else if(sech.isSelected()){
                        double x,y;
                        if(e.getSource()==Button){
                        x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                        y = (double) (1/(Math.cosh(x)));
                        resultField.setText(Double.toString(y));
                      
                      }}
                      else if(cosech.isSelected()){
                        double x,y;
                        if(e.getSource()==Button){
                        x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                        y = (double) (1/(Math.sinh(x)));
                        resultField.setText(Double.toString(y));
                      
                      }}
                      else if(coth.isSelected()){
                        double x,y;
                        if(e.getSource()==Button){
                        x = Math.toRadians(Double.parseDouble(num1Field.getText()));
                        y = (double) (1/(Math.tanh(x)));
                        resultField.setText(Double.toString(y));
                      
                      }}
                      
                    }
                    
                
                }
                
          }
        
        }
        catch (NumberFormatException | InputMismatchException | ArithmeticException ex){
            resultField.setText("Enter a valid input");
        }
        
        }
        
       
}

public class CalMid {

   
    public static void main(String[] args) //main method
    {   
        MyFrame frame = new MyFrame();   //Creating frame using MyFrame class
        
        final int width = 610, height =610;
        frame.setBounds(100,100,width,height);           // frame size
        frame.setTitle("Calculator");    //Title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit on cross
        
        
       
        frame.setVisible(true);         //Displaying frame
    }
    
}
