package com.company;

public abstract class person {

    String name;
    String phno;
    String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (this.email == email) {
            this.email = email;
        }
   /* else{
        Exception er=new Exception("special character required");
        throw er;
        }

    */
    }


    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno)throws Exception {
        if (phno.length()<=11){
        this.phno = phno;
    }
    else {
        Exception er=new Exception("less than 11");
        throw er;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}


