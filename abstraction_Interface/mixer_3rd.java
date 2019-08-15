package com.hefshine.abstraction_Interface;
//class Mixer extends Machine {
	class Mixer extends Machine{
		
		void blend(){
			System.out.println("in blend method of Mixer class");
			}
		
		@Override
		void Crush() {
			// TODO Auto-generated method stub
			System.out.println("in implemented crush method of Machine class");
		}
		}

		public class mixer_3rd extends Mixer {
			public static void main(String[] args) {
			
				Mixer m = new Mixer() ;
				m.blend();
				m.Crush();
				m.rotate();
			}
		}