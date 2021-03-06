package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;

@ManagedBean

public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;

    private ToDoList toDoList;
    
	public ToDoList getToDoList() {
		return toDoList;
	}


	public ToDoListMB() {
		super();
		toDoList = new ToDoList();
	}    


	//Should be called if the Button "Speichern" is pushed.
	//Needs configuration in the faces-config.xml.
    public String save() {
    	return "save";
    }
}
