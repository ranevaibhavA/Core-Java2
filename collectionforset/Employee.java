package com.hefshine.collectionforset;

public class Employee {
	
		int id;
		String name;
		float sal;

		public Employee(int id, String name, float sal) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
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

		public float getSal() {
			return sal;
		}

		public void setSal(float sal) {
			this.sal = sal;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}

		public void displayData() {

			System.out.println("***************************************id: " + id + " name: " + name + "  sal: " + sal);
		}

	}


