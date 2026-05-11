import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementing Calculator class
public class Calculator implements ActionListener {
    //Creating variables for our calculations
    double number;  //A variable I'll use later on for calculation
    int calculation; //A variable I'll use to switch case for each operation
    JFrame frame; //the frame
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton hexadecimalRadioButton = new JRadioButton("Hexadecimal"); //Radiobutton for hexadecimal
    JRadioButton decimalRadioButton = new JRadioButton("Decimal"); //RadioButton for decimal
    JRadioButton binaryRadioButton = new JRadioButton("Binary"); //RadioButton fo binary
    JButton buttonZero = new JButton("0");   //Button for 0
    JButton buttonOne = new JButton("1");    //Button for 1
    JButton buttonTwo = new JButton("2"); //Button for 2
    JButton buttonThree = new JButton("3");//Button for 3
    JButton buttonFour = new JButton("4"); //Button for 4
    JButton buttonFive = new JButton("5");//Button for 5
    JButton buttonSix = new JButton("6");//Button for 6
    JButton buttonSeven = new JButton("7");   //Button for 7
    JButton buttonEight = new JButton("8");   //Button for 8
    JButton buttonNine = new JButton("9");   //Button for 9
    JButton buttonA = new JButton("A");    //Button for A
    JButton buttonB = new JButton("B");   //Button for B
    JButton buttonC = new JButton("C");  //Button for C
    JButton buttonD = new JButton("D");  //Button for D
    JButton buttonE = new JButton("E");//Button for E
    JButton buttonF = new JButton("F");  //Button for F
    JButton buttonPlus = new JButton("+");   //Button for + operator
    JButton buttonMinus = new JButton("-");    //Button for - operator
    JButton buttonMul = new JButton("x");   //Button for multiplication operator
    JButton buttonDiv = new JButton("/");   //Button for division operator
    JButton buttonEqual = new JButton("=");   //Button for equal
    JButton buttonNot = new JButton("NOT"); //Button for Not
    JButton buttonLsh = new JButton("<<"); //Button for <<
    JButton buttonRsh = new JButton(">>");//Button for >>
    JButton buttonClear = new JButton("Clear"); //Button for Clear
    JButton buttonAnd = new JButton("AND");  //Button for AND
    JButton buttonOr = new JButton("OR"); // //Button for OR
    JButton buttonXor = new JButton("XOR"); //Button for Xor



    Calculator() {   //Constructor
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {   //Method to prepare the graphical user interface
        frame = new JFrame();    //creating an instance of frame where the things will be added
        frame.setTitle(" Prorammer Calculator");  // Write programmer calculator as the title of the frame
        frame.setSize(800, 600);  //Setting size of the frame
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE); //Put gray as the background color of the frame
        frame.setResizable(false);  // make the frame not resizable
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  // make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Exit on close
    }

    public void addComponents() {  //adding the necessary component
        label.setBounds(700, 0, 50, 50);
        label.setForeground(Color.black);  //set the foreground color to black
        label.setBackground(Color.white);   //set the background color to white
        label.setOpaque(true); // Ensure the background color is visible
        frame.add(label);  //adding label to frame

        textField.setBounds(300, 15, 300, 125); // Set the position and size of the text field
        textField.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for the text field
        textField.setBackground(Color.WHITE); // Set background color of the text field
        textField.setForeground(Color.BLACK); // Set text color of the text field
        textField.setEditable(false); // Make the text field non-editable
        textField.setHorizontalAlignment(SwingConstants.RIGHT); // Align text to the right
        frame.add(textField); // Add the text field to the frame

        hexadecimalRadioButton.setBounds(10, 20, 200, 30); // Set position and size of the hexadecimal radio button
        hexadecimalRadioButton.setSelected(true); // Set the hexadecimal radio button as selected
        hexadecimalRadioButton.setFont(new Font("Arial", Font.BOLD, 18)); // Set font for the hexadecimal radio button
        hexadecimalRadioButton.setBackground(Color.white); // Set background color of the hexadecimal radio button
        hexadecimalRadioButton.setForeground(Color.black); // Set text color of the hexadecimal radio button
        frame.add(hexadecimalRadioButton); // Add the hexadecimal radio button to the frame

        decimalRadioButton.setBounds(10, 60, 200, 30); // Set position and size of the decimal radio button
        decimalRadioButton.setSelected(false); // Set the decimal radio button as not selected
        decimalRadioButton.setFont(new Font("Arial", Font.BOLD, 18)); // Set font for the decimal radio button
        decimalRadioButton.setBackground(Color.white); // Set background color of the decimal radio button
        decimalRadioButton.setForeground(Color.black); // Set text color of the decimal radio button
        frame.add(decimalRadioButton); // Add the decimal radio button to the frame

        binaryRadioButton.setBounds(10, 100, 200, 30); // Set position and size of the binary radio button
        binaryRadioButton.setSelected(false); // Set the binary radio button as not selected
        binaryRadioButton.setFont(new Font("Arial", Font.BOLD, 18)); // Set font for the binary radio button
        binaryRadioButton.setBackground(Color.white); // Set background color of the binary radio button
        binaryRadioButton.setForeground(Color.black); // Set text color of the binary radio button
        frame.add(binaryRadioButton); // Add the binary radio button to the frame

        ButtonGroup buttonGroup = new ButtonGroup(); // Create a button group for radio buttons
        buttonGroup.add(hexadecimalRadioButton); // Add hexadecimal radio button to the group
        buttonGroup.add(decimalRadioButton); // Add decimal radio button to the group
        buttonGroup.add(binaryRadioButton); // Add binary radio button to the group

        buttonA.setBounds(15, 150, 140, 55); // Set position and size of button A
        buttonA.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button A
        frame.add(buttonA); // Add button A to the frame

        buttonB.setBounds(15, 215, 140, 55); // Set position and size of button B
        buttonB.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button B
        frame.add(buttonB); // Add button B to the frame

        buttonC.setBounds(15, 280, 140, 55); // Set position and size of button C
        buttonC.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button C
        frame.add(buttonC); // Add button C to the frame

        buttonD.setBounds(15, 345, 140, 55); // Set position and size of button D
        buttonD.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button D
        frame.add(buttonD); // Add button D to the frame

        buttonE.setBounds(15, 410, 140, 55); // Set position and size of button E
        buttonE.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button E
        frame.add(buttonE); // Add button E to the frame

        buttonF.setBounds(15, 475, 140, 55); // Set position and size of button F
        buttonF.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button F
        frame.add(buttonF); // Add button F to the frame

        buttonNot.setBounds(165, 150, 140, 55); // Set position and size of NOT button
        buttonNot.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for NOT button
        frame.add(buttonNot); // Add NOT button to the frame

        buttonLsh.setBounds(315, 150, 140, 55); // Set position and size of left shift button
        buttonLsh.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for left shift button
        frame.add(buttonLsh); // Add left shift button to the frame

        buttonRsh.setBounds(465, 150, 140, 55); // Set position and size of right shift button
        buttonRsh.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for right shift button
        frame.add(buttonRsh); // Add right shift button to the frame

        buttonClear.setBounds(615, 150, 140, 55); // Set position and size of clear button
        buttonClear.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for clear button
        buttonClear.setBackground(Color.red); // Set background color of clear button
        frame.add(buttonClear); // Add clear button to the frame

        buttonAnd.setBounds(165, 215, 140, 55); // Set position and size of AND button
        buttonAnd.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for AND button
        frame.add(buttonAnd); // Add AND button to the frame

        buttonSeven.setBounds(165, 280, 140, 55); // Set position and size of button 7
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 7
        buttonSeven.setBackground(Color.gray); // Set background color of button 7
        frame.add(buttonSeven); // Add button 7 to the frame

        buttonFour.setBounds(165, 345, 140, 55); // Set position and size of button 4
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 4
        buttonFour.setBackground(Color.gray); // Set background color of button 4
        frame.add(buttonFour); // Add button 4 to the frame

        buttonOne.setBounds(165, 410, 140, 55); // Set position and size of button 1
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 1
        buttonOne.setBackground(Color.gray); // Set background color of button 1
        frame.add(buttonOne); // Add button 1 to the frame

        buttonOr.setBounds(315, 215, 140, 55); // Set position and size of OR button
        buttonOr.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for OR button
        frame.add(buttonOr); // Add OR button to the frame

        buttonEight.setBounds(315, 280, 140, 55); // Set position and size of button 8
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 8
        buttonEight.setBackground(Color.gray); // Set background color of button 8
        frame.add(buttonEight); // Add button 8 to the frame

        buttonFive.setBounds(315, 345, 140, 55); // Set position and size of button 5
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 5
        buttonFive.setBackground(Color.gray); // Set background color of button 5
        frame.add(buttonFive); // Add button 5 to the frame

        buttonTwo.setBounds(315, 410, 140, 55); // Set position and size of button 2
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 2
        buttonTwo.setBackground(Color.gray); // Set background color of button 2
        frame.add(buttonTwo); // Add button 2 to the frame

        buttonZero.setBounds(315, 475, 140, 55); // Set position and size of button 0
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 0
        buttonZero.setBackground(Color.gray); // Set background color of button 0
        frame.add(buttonZero); // Add button 0 to the frame

        buttonXor.setBounds(465, 215, 140, 55); // Set position and size of XOR button
        buttonXor.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for XOR button
        frame.add(buttonXor); // Add XOR button to the frame

        buttonNine.setBounds(465, 280, 140, 55); // Set position and size of button 9
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 9
        buttonNine.setBackground(Color.gray); // Set background color of button 9
        frame.add(buttonNine); // Add button 9 to the frame

        buttonSix.setBounds(465, 345, 140, 55); // Set position and size of button 6
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 6
        buttonSix.setBackground(Color.gray); // Set background color of button 6
        frame.add(buttonSix); // Add button 6 to the frame

        buttonThree.setBounds(465, 410, 140, 55); // Set position and size of button 3
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for button 3
        buttonThree.setBackground(Color.gray); // Set background color of button 3
        frame.add(buttonThree); // Add button 3 to the frame

        buttonPlus.setBounds(615, 215, 140, 55); // Set position and size of + button
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for + button
        frame.add(buttonPlus); // Add + button to the frame

        buttonMinus.setBounds(615, 280, 140, 55); // Set position and size of - button
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for - button
        frame.add(buttonMinus); // Add - button to the frame

        buttonMul.setBounds(615, 345, 140, 55); // Set position and size of x button
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for x button
        frame.add(buttonMul); // Add x button to the frame

        buttonDiv.setBounds(615, 410, 140, 55); // Set position and size of / button
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for / button
        frame.add(buttonDiv); // Add / button to the frame

        buttonEqual.setBounds(615, 475, 140, 55); // Set position and size of = button
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20)); // Set font for = button
        frame.add(buttonEqual); // Add = button to the frame
    }

        public void addActionEvent () {
            // Registering ActionListener to buttons
            hexadecimalRadioButton.addActionListener(this); // Add action listener to hexadecimal radio button
            decimalRadioButton.addActionListener(this); // Add action listener to decimal radio button
            binaryRadioButton.addActionListener(this); // Add action listener to binary radio button
            buttonZero.addActionListener(this); // Add action listener to button 0
            buttonOne.addActionListener(this); // Add action listener to button 1
            buttonTwo.addActionListener(this); // Add action listener to button 2
            buttonThree.addActionListener(this); // Add action listener to button 3
            buttonFour.addActionListener(this); // Add action listener to button 4
            buttonFive.addActionListener(this); // Add action listener to button 5
            buttonSix.addActionListener(this); // Add action listener to button 6
            buttonSeven.addActionListener(this); // Add action listener to button 7
            buttonEight.addActionListener(this); // Add action listener to button 8
            buttonNine.addActionListener(this); // Add action listener to button 9
            buttonA.addActionListener(this); // Add action listener to button A
            buttonB.addActionListener(this); // Add action listener to button B
            buttonC.addActionListener(this); // Add action listener to button C
            buttonD.addActionListener(this); // Add action listener to button D
            buttonE.addActionListener(this); // Add action listener to button E
            buttonF.addActionListener(this); // Add action listener to button F
            buttonPlus.addActionListener(this); // Add action listener to + button
            buttonMinus.addActionListener(this); // Add action listener to - button
            buttonMul.addActionListener(this); // Add action listener to x button
            buttonDiv.addActionListener(this); // Add action listener to / button
            buttonEqual.addActionListener(this); // Add action listener to = button
            buttonClear.addActionListener(this); // Add action listener to clear button
            buttonAnd.addActionListener(this); // Add action listener to AND button
            buttonOr.addActionListener(this); // Add action listener to OR button
            buttonXor.addActionListener(this); // Add action listener to XOR button
            buttonNot.addActionListener(this); // Add action listener to NOT button
            buttonLsh.addActionListener(this); // Add action listener to left shift button
            buttonRsh.addActionListener(this); // Add action listener to right shift button
        }



    private void disableDecimalButon() { // Method to disable decimal buttons
        buttonZero.setEnabled(false); // Disable button 0
        buttonOne.setEnabled(false); // Disable button 1
        buttonTwo.setEnabled(false); // Disable button 2
        buttonThree.setEnabled(false); // Disable button 3
        buttonFour.setEnabled(false); // Disable button 4
        buttonFive.setEnabled(false); // Disable button 5
        buttonSix.setEnabled(false); // Disable button 6
        buttonSeven.setEnabled(false); // Disable button 7
        buttonEight.setEnabled(false); // Disable button 8
        buttonNine.setEnabled(false); // Disable button 9
    }

    private void enableDecimalButon() { // Method to enable decimal buttons
        buttonZero.setEnabled(true); // Enable button 0
        buttonOne.setEnabled(true); // Enable button 1
        buttonTwo.setEnabled(true); // Enable button 2
        buttonThree.setEnabled(true); // Enable button 3
        buttonFour.setEnabled(true); // Enable button 4
        buttonFive.setEnabled(true); // Enable button 5
        buttonSix.setEnabled(true); // Enable button 6
        buttonSeven.setEnabled(true); // Enable button 7
        buttonEight.setEnabled(true); // Enable button 8
        buttonNine.setEnabled(true); // Enable button 9
    }
    public void enableAndDisable() { // Method to enable and disable buttons
        // Below are the buttons that will be enabled no matter the mode of the calculator
        textField.setEnabled(true); // Enable the text field
        label.setEnabled(true); // Enable the label
        buttonClear.setEnabled(true); // Enable the clear button
        buttonRsh.setEnabled(true); // Enable the right shift button
        buttonLsh.setEnabled(true); // Enable the left shift button
        buttonPlus.setEnabled(true); // Enable the + button
        buttonMinus.setEnabled(true); // Enable the - button
        buttonMul.setEnabled(true); // Enable the x button
        buttonDiv.setEnabled(true); // Enable the / button
        buttonEqual.setEnabled(true); // Enable the = button
        buttonNot.setEnabled(true); // Enable the NOT button
        buttonAnd.setEnabled(true); // Enable the AND button
        buttonOr.setEnabled(true); // Enable the OR button
        buttonXor.setEnabled(true); // Enable the XOR button
        buttonSeven.setEnabled(true); // Enable button 7
        buttonEight.setEnabled(true); // Enable button 8
        buttonNine.setEnabled(true); // Enable button 9
        buttonFour.setEnabled(true); // Enable button 4
        buttonFive.setEnabled(true); // Enable button 5
        buttonSix.setEnabled(true); // Enable button 6
        buttonOne.setEnabled(true); // Enable button 1
        buttonTwo.setEnabled(true); // Enable button 2
        buttonThree.setEnabled(true); // Enable button 3
        buttonZero.setEnabled(true); // Enable button 0
        if(hexadecimalRadioButton.isSelected()) { // Check if we are in hexadecimal mode
            enableDecimalButon(); // ENAble button from 1 to 9
            buttonA.setEnabled(true); //Enable button A
            buttonB.setEnabled(true);  //Enable button B
            buttonC.setEnabled(true); //Enable button C
            buttonD.setEnabled(true);//Enable button D
            buttonE.setEnabled(true);//Enable button E
            buttonF.setEnabled(true);//Enable button F
        } else if (decimalRadioButton.isSelected()) { //Check if the mode is in decimal
            enableDecimalButon(); //enable button from 0 to 9
            buttonA.setEnabled(false); //disable button A
            buttonB.setEnabled(false);  //disable button B
            buttonC.setEnabled(false); //disable button C
            buttonD.setEnabled(false);//disable button D
            buttonE.setEnabled(false);//disable button E
            buttonF.setEnabled(false);//disable button F
        }
        else {  //Check if we are in binary mode
            disableDecimalButon(); // disable button from 1 to 9 first but enable 0 amd 1 in the next line
            buttonZero.setEnabled(true);buttonOne.setEnabled(true); //enable 0 and 1
            buttonA.setEnabled(false); //disable button A
            buttonB.setEnabled(false);  //disable button B
            buttonC.setEnabled(false); //disable button C
            buttonD.setEnabled(false);//disable button D
            buttonE.setEnabled(false);//disable button E
            buttonF.setEnabled(false);//disable button F //disable button from 0 to 9
        }


    }






    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == hexadecimalRadioButton || source == decimalRadioButton || source == binaryRadioButton) { //see if a radio button is selected
            enableAndDisable();
        }
        else if (source == buttonClear) {  //if clear is clicked
            label.setText("");    //clear textfield
            textField.setText("");   // remove text in textfield
        }
        else if (source instanceof JButton) {
            String buttonText = ((JButton) source).getText();
            if ("0123456789ABCDEF".contains(buttonText)) {
                textField.setText(textField.getText() + buttonText);
            }else if (source == buttonLsh) {
                calculation = 8; // Set calculation identifier for left shift
                number = parseInput(textField.getText()); // Store the current number
                textField.setText(""); // Clear the text field for next input
                label.setText(number + " <<"); // Show operation
            } else if (source == buttonRsh) {
                calculation = 9; // Set calculation identifier for right shift
                number = parseInput(textField.getText()); // Store the current number
                textField.setText(""); // Clear the text field for next input
                label.setText(number + " >>"); // Show operation
            }
            else { // Else block for handling button actions
                switch (buttonText) { // Switch statement to determine button action
                    case "AND": // Case for AND button
                        prepareLogicalCalculation("AND"); // Prepare logical calculation for AND
                        break; // Exit switch
                    case "OR": // Case for OR button
                        prepareLogicalCalculation("OR"); // Prepare logical calculation for OR
                        break; // Exit switch
                    case "XOR": // Case for XOR button
                        prepareLogicalCalculation("XOR"); // Prepare logical calculation for XOR
                        break; // Exit switch
                    case "NOT": // Case for NOT button
                        calculateNotOperation(); // Calculate NOT operation
                        break; // Exit switch
                    case "=": // Case for equal button
                        calculateResult(); // Calculate the result
                        break; // Exit switch
                    default: // Default case for arithmetic operations
                        handleArithmeticOperations(buttonText); // Handle arithmetic operations based on button text
                }
            }
        }
    }

    private void displayResult(double result) {   // a method to display result
        if (hexadecimalRadioButton.isSelected()) {   //check if the mode is hexadecimal
            textField.setText(Integer.toHexString((int) result).toUpperCase());
        } else if (binaryRadioButton.isSelected()) {   //check if binary
            textField.setText(Integer.toBinaryString((int) result));  //set the result to textfield
        } else {
            textField.setText(Double.toString(result));   //write the result to textfield
        }
        label.setText(""); // Clear the label
    }

    private double parseInput(String input) {
        if (hexadecimalRadioButton.isSelected()) {
            return Integer.parseInt(input, 16); // Hexadecimal to decimal
        } else if (binaryRadioButton.isSelected()) {
            return Integer.parseInt(input, 2); // Binary to decimal
        } else {
            return Double.parseDouble(input); // Decimal
        }
    }

    private void handleArithmeticOperations(String operator) {
        if (textField.getText().isEmpty()) {
            textField.setText("Error");
            return; // Prevent further processing with invalid input
        }

        number = parseInput(textField.getText());
        textField.setText(""); // Clear the text field for the next input
        label.setText(number + " " + operator); // Update the label to show the operation

        switch (operator) {
            case "+":
                calculation = 1; // Addition
                break;
            case "-":
                calculation = 2; // Subtraction
                break;
            case "x":
                calculation = 3; // Multiplication
                break;
            case "/":
                calculation = 4; // Division
                break;


        }
    }

    private void prepareLogicalCalculation(String operator) {  //A method for logic calculator
        number = parseInput(textField.getText());
        textField.setText("");  //clear text field by putting empty string
        label.setText(textField.getText() + operator);  //put the one entered in label
        calculation = operator.equals("AND") ? 5 :    // case 5  for and
                operator.equals("OR") ? 6 :        // case 6 for or
                        operator.equals("XOR") ? 7 : -1;   //otherwise it is XOR
    }

    private void calculateNotOperation() {   //A method for not operation
        int numberToNot = (int) parseInput(textField.getText());  //a new variable called numberToNot
        if (binaryRadioButton.isSelected()) {
            numberToNot = ~numberToNot & 1; // Apply NOT for binary
        } else {
            numberToNot = ~numberToNot; // Apply NOT for decimal or hexadecimal
        }
        displayResult(numberToNot);    //display the esult for umer to Not
    }

    private void calculateResult() {  //method to calculate the result for each case
        double result = 0;

        try {
            switch (calculation) {
                case 1: // Addition
                    result = number + parseInput(textField.getText()); //set the result FOR ADDITION
                    break;
                case 2: // Subtraction
                    result = number - parseInput(textField.getText());//set the result FOR SUBSTRACTION
                    break;
                case 3: // Multiplication
                    result = number * parseInput(textField.getText());  //set the result FOR MultiplicatION
                    break;
                case 4: // Division
                    double divisor = parseInput(textField.getText());   //set the result FOR division
                    if (divisor == 0) {
                        textField.setText("Error"); // Handle division by zero
                        return;
                    }
                    result = number / divisor;
                    break;
                case 5: // AND
                    result = (int) number & (int) parseInput(textField.getText());  //set the result for AND
                    break;
                case 6: // OR
                    result = (int) number | (int) parseInput(textField.getText()); //set the result for OR
                    break;
                case 7: // XOR
                    result = (int) number ^ (int) parseInput(textField.getText()); //set the result for XOR
                    break;
                default:
                    textField.setText("Error"); // Handle unknown operations
                    return;
                case 8: // Left Shift
                    result = (int) number << (int) parseInput(textField.getText());   //set the result LEFT SHIFT
                    break;
                case 9: // Right Shift
                    result = (int) number >> (int) parseInput(textField.getText());  //set the result RIGHT SHIFT
                    break;
            }
        } catch (NumberFormatException e) {
            textField.setText("Error"); // Handle invalid input formats
            return;
        }

        displayResult(result); // Display the calculated result in the selected mode
    }

    /*private void performLeftShift() {
        try {
            int value = (int) parseInput(textField.getText());
            int shiftAmount = 1; // Define the shift amount (can be user-defined)
            int result = value << shiftAmount; // Perform left shift
            displayResult(result); // Display the result
        } catch (NumberFormatException e) {
            textField.setText("Error"); // Handle invalid input
        }
    }

    private void performRightShift() {
        try {
            int value = (int) parseInput(textField.getText());
            int shiftAmount = 1; // Define the shift amount (can be user-defined)
            int result = value >> shiftAmount; // Perform right shift
            displayResult(result); // Display the result
        } catch (NumberFormatException e) {
            textField.setText("Error"); // Handle invalid input
        }
    }*/
    public static void main(String[] args) { //main method to test the calculator
        new Calculator();
    }
}





