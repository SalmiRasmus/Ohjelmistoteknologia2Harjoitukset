package com.example.harjoitus2teht2.domain;

public class Friend {

		private String Name;

		
		public Friend(){
			
		}


		public String getName() {
			return Name;
		}


		public void setName(String name) {
			Name = name;
		}


		@Override
		public String toString() {
			return "Friend [Name=" + Name + "]";
		}


		public Friend(String name) {
			super();
			Name = name;
		}
		
		

}
