function findLongestWord(string)
{
    var split = string.split(" ");
    var longestWord="";
    for(var word of split)
    {
        if(longestWord.length<word.length)
            longestWord=word;
    }
    return longestWord;
}
