function $(id)
{
    return document.getElementById(id);
}

function AlterNativeRowColor()
{
    var row = $('tb1').rows;
    var totalRows = row.length;
    var color = ['orange','blue'];
    for(var i = 0 ; i<totalRows; i++)
    {
        if(i%2==0)
        {
            newColor = color[0];
        }
        else
        {
            newColor = color[1]; 
        }
        row.item(i).style.backgroundColor=newColor;
    }
}

function BoldHeaderFont()
{
    $('tb1').rows[0].style.fontWeight='bold';
}


function AlterNativeCellTextColor()
{
    var row = $('tb1').rows;
    var totalRows = row.length;
    var color = ['red','green'];
    for(var i = 0 ; i<totalRows; i++)
    {
        for(var j = 0; j<row[i].cells.length; j++)
        {
            if(j%2==0)
            {
                newColor = color[0];
            }
            else
            {
                newColor = color[1]; 
            }
            row[i].cells[j].style.color=newColor;
        }
    }
}

function LastCellItalicText()
{
    var row = $('tb1').rows;
    var totalRows = row.length;
    row[totalRows-1].style.fontStyle='italic';
}


function FirstElementRowUnderLine()
{
    var row = $('tb1').rows;
    var totalRows = row.length;
    var color = ['red','green'];
    for(var i = 0 ; i<totalRows; i++)
    {                
        row[i].cells[0].style.textDecoration='underline';
    }
}

        