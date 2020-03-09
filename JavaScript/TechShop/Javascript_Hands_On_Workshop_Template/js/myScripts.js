document.getElementById("checkoutdiv").style.display = "none";
document.getElementById("products").onmouseover = function(event){		
	// Your code here
};
document.getElementById("checkout").onclick =function(){
	document.getElementById("checkoutdiv").style.display = "";
};

document.getElementById("products").onclick = function(e){
	
	var target = e.target.parentNode;
	var img = "<img src='images/invalid.png' />";
	text = target.title;
	var price="";
	var itemName="";
		
		if(text==='Dell')
		{
			price = e.target.parentNode.getElementsByTagName('p')[2].innerHTML;
			itemName = e.target.parentNode.getElementsByTagName('h2')[0].innerHTML;
			if(document.getElementById('noItemMsg').innerHTML=="You have no items in your cart.")
			{
				document.getElementById("noItemMsg").innerHTML=img+" "+itemName+" "+price;
			}
			else
			{
				document.getElementById("noItemMsg").innerHTML+="<br>"+img+" "+itemName+" "+price;
			}
			
		}
		else if(text==='Apple')
		{
			price = e.target.parentNode.getElementsByTagName('p')[2].innerHTML;
			itemName = e.target.parentNode.getElementsByTagName('h2')[0].innerHTML;
			if(document.getElementById('noItemMsg').innerHTML=="You have no items in your cart.")
			{
				document.getElementById("noItemMsg").innerHTML=img+" "+itemName+" "+price;
			}
			else
			{
				document.getElementById("noItemMsg").innerHTML+="<br>"+img+" "+itemName+" "+price;
			}
		}
		else if(text === 'hp')
		{
			price = e.target.parentNode.getElementsByTagName('p')[2].innerHTML;
			itemName = e.target.parentNode.getElementsByTagName('h2')[0].innerHTML;
			if(document.getElementById('noItemMsg').innerHTML=="You have no items in your cart.")
			{
				document.getElementById("noItemMsg").innerHTML=img+" "+itemName+" "+price;
			}
			else
			{
				document.getElementById("noItemMsg").innerHTML+="<br>"+img+" "+itemName+" "+price;
			}
		}
	  
};
document.getElementById("cart-content").onclick = function(event){	
	// Your code here	
};
document.getElementById("remove").onclick = function(){	
	// Your code here
};
document.getElementById("submit").onclick = function(){
	// Here is AJAX implementation to send data to the server in .jsp file.
};
function changePic(name,elemImg){	
}



function getProductName(arr)
{

}
