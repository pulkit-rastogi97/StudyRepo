function input()
{

   var inputTemperature; 
   var inputChoice = prompt("Welcome to Temperature Converter \n1. Celsius to Fahrenheit.\n2. Fahrenheit to Celsius.\nKindly, enter your choice : ","1");
   if(inputChoice==1)
   {
        inputTemperature = prompt("Enter the temperature in celsius : ");
        return inputChoice+" "+inputTemperature+" "+celsiusToFahrenheit(inputTemperature);
   }
   else if(inputChoice==2)
   {
        inputTemperature = prompt("Enter the temperature in fahrenheit : ");
        return inputChoice+" "+inputTemperature+" "+fahrenheitToCelsius(inputTemperature);
   } 
   else{
     var con = confirm("You entered invalid input. \n Want to continue ? ");
     if(con)
     {
         input();
     }
     else
     {
        document.write("Thanks for your visit !! ");
     }
   }  
}

function celsiusToFahrenheit(inputTemperature)
{
    return (((inputTemperature/5)*9)+32);
}

function fahrenheitToCelsius(inputTemperature)
{
    return (((inputTemperature-32)/9)*5);
}