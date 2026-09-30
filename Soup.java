//Name: Heena KB
//Date: 09/29/26
//This program creates a soup object that stores a collection of letters and a company name. Different commands can be used to do things like adding and moving around the letters.

public class Soup {
    //precondition: letters and company are declared.
    //postcondition: letters is empty and company is "none".
    private String letters;
    private String company;

    //precondition: soup object is created.
    //postcondition: letters is "" and compy is "none".
    public Soup(){
        letters ="";
        company = "none";
    }


    //precondition: company is a valid string.
    //postcondition: company is updated.
    public void setCompany(String company){
        this.company = company;
    }

    //precondition: Soup object exitsts.
    //postcondition: returns company.
    public String getCompany(){
        return company;
    }

    //precondition: soudp object exists.
    //postcondition: returns letters.
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.
    
    //precondition: word is a valid string.
    //postcondition: word is added to letters.
    public void add(String word){
    letters += word;
    }


    //precondition: letters is not empty.
    //postcondition: returns a random letter.
    public char randomLetter(){
        return letters.charAt((int)(Math.random()*letters.length()));
    }


    //precondition: letters and company are valid.
    //postcondition: returns company in the center.
    public String companyCentered(){
        return letters.substring(0,letters.length() / 2) + company + letters.substring(letters.length() / 2);
    }


    //precondition: letters contains a vowel.
    //postcondition: letters no longer contains the first vowel found
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[aeiou]", "");
    }

    //precondition: num is valid and less than or equal to length of letters.
    //postcondition: num random letters are removed.
    public void removeSome(int num){
        int random = (int)(Math.random() * (letters.length() - num + 1));
        letters = letters.substring(0,random) + letters.substring(random + num);
        
    }

    //precondition: word is a valid string.
    //postcondition: first occurrence of word is removed.
    public void removeWord(String word){
        int index = letters.indexOf(word);
        if(index != -1){
          letters = letters.substring(0, index) + letters.substring(index + word.length());
        }
    }
}
