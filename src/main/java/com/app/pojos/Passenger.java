package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Passenger extends User{

	@OneToMany
    @JoinColumn(name="fk_dratings")
    private List<Feedback> items = new ArrayList<Feedback>();
	
}
