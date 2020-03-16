
//To return the reference of object
function $(id)
{
    return document.getElementById(id);
}

//To Display DropDown Menu Contents and count of values
function displayAll()
{       
    var list = $('cars').options;
    var str="";
    for(var value of list)
    {
        str+=value.textContent+" , ";
    }
    alert("Values : "+str+" \n Total Values = "+list.length);
}


        