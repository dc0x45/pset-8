import java.util.ArrayList;

public class MailingAddress {

        String primaryStreet;
        String secondaryStreet;
        String city;
        String state;
        String postalCode;

    public MailingAddress(String primaryStreet, String secondaryStreet, String city, String state, String postalCode) {
        this.primaryStreet = primaryStreet;
        this.secondaryStreet = secondaryStreet;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    // basic return string statements

    public String getPrimaryStreet(){
        if(this.primaryStreet != null){
            return this.primaryStreet;
        } else return null;
    }

    public String getSecondaryStreet(){
        if(this.secondaryStreet != null){
            return this.secondaryStreet;
        } else return null;
    }

    public String getPostalCode(){
        if(this.postalCode != null){
            return this.postalCode;
        } else return null;
    }

    public String getState(){
        if(this.state != null){
            return this.state;
        } else return null;
    }

    public String getCity(){
        if(this.city != null){
            return this.city;
        } else return null;
    }

    // the faux documentation is unclear about the implementation of a formatted address

    public String getFormattedAddress(){
        ArrayList<String> fullAddr = new ArrayList<String>();
        fullAddr.add(getPrimaryStreet());
        fullAddr.add(getSecondaryStreet());
        fullAddr.add(getCity());
        fullAddr.add(getState());
        fullAddr.add(getPostalCode());
        String notStringBuilder = "";
        notStringBuilder = fullAddr.get(0);
        for(int i=1; i<fullAddr.size(); i++){
            if(fullAddr.get(i) != null){
                notStringBuilder += ", " + fullAddr.get(i);
            }
        }
        return notStringBuilder;
    }    

    // game, SET, match!

    public void setPrimaryStreet(String primaryStreet){
        this.primaryStreet = primaryStreet;
    }

    public void setSecondaryStreet(String secondaryStreet){
        this.secondaryStreet = secondaryStreet;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public void setCity(String city){
        this.city = city;
    }

    // validation

    public String validateStreet(String street){
        if (street != null && street.length() > 0){
            return street;
        } else return null;
    }

    public String validateCity(String city){
        if (city != null && city.length() > 0){
            return city;
        } else return null;
    }

    // Are both abbreviations and the full length valid since the documentation states that they will be stored in two letter abbreviation format?
    // Should ask on Thursday
/*
    public String validateState(String state){
        if (state != null && state.length() > 0){
            return state;
        } else return null;
    }
*/

    public String validatePostalCode(String postalCode){
        if (postalCode != null && postalCode.length() == 5){
            boolean notValid = true;
            for(int i=0; i<=5; i++){
                if(notValid && Character.isDigit(postalCode.charAt(i))){}
                else notValid = false;
            }
            if (notValid){
                return postalCode;
            } else return null;
        } else return null;
    }
}
