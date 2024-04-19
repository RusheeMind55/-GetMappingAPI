package com.jbk.GetMapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Team {
		
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
		int id;
		
		String name;
		
		String roll;
		
		public Team() {
			
		}
		

		public Team(int id, String name, String roll) {
			super();
			this.id = id;
			this.name = name;
			this.roll = roll;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRoll() {
			return roll;
		}

		public void setRoll(String roll) {
			this.roll = roll;
		}

		@Override
		public String toString() {
			return "Team [id=" + id + ", name=" + name + ", roll=" + roll + "]";
		}
		
		
}
