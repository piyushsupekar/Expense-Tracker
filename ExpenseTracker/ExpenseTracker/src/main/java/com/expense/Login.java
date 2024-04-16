package com.expense;

public class Login {
private String uname,pass;

public Login() {
	super();
	// TODO Auto-generated constructor stub
}

public Login(String uname, String pass) {
	super();
	this.uname = uname;
	this.pass = pass;
}

@Override
public String toString() {
	return "Login [uname=" + uname + ", pass=" + pass + "]";
}

/**
 * @return the uname
 */
public String getUname() {
	return uname;
}

/**
 * @return the pass
 */
public String getPass() {
	return pass;
}

/**
 * @param uname the uname to set
 */
public void setUname(String uname) {
	this.uname = uname;
}

/**
 * @param pass the pass to set
 */
public void setPass(String pass) {
	this.pass = pass;
}

}
