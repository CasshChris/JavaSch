// 1 :: Declare variables for project
String strNumber1, strNumber2, strResult;
int number1, number2, result;

// 2 :: Get test form text box
strNumber1 = txtNumber1.getText();
strNumber2 = txtNumber2.getText();

// 3 :: Covert from string to int
number1 = Integer.parseInt(strNumber1);
number2 = Integer.parseInt(strNumber2);

// 4 :: Calculate the sum & store in result
result = number1  number2;

// 5 :: convert result into string & store it in strResult
strResult = String.format("%s", result);

// 6 :: Print strResult with lblResult
lblResult.setText(strResult);


how to spell stuff:

Quotient // Division

Product // Multiply

Sum // Addition

Difference // Subtraction