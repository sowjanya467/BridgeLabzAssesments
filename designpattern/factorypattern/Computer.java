/**
 * 
 */
package com.bridgelabz.designpattern.factorypattern;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public abstract class Computer 
{
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
	public class PC extends Computer {

		private String ram;
		private String hdd;
		private String cpu;
		
		public PC(String ram, String hdd, String cpu){
			this.ram=ram;
			this.hdd=hdd;
			this.cpu=cpu;
		}
		@Override
		public String getRAM() {
			return this.ram;
		}

		@Override
		public String getHDD() {
			return this.hdd;
		}

		@Override
		public String getCPU() {
			return this.cpu;
		}
	}
	public class Server extends Computer
	{
		private String ram;
		private String hdd;
		private String cpu;
		
		public Server(String ram, String hdd, String cpu){
			this.ram=ram;
			this.hdd=hdd;
			this.cpu=cpu;
		}
		@Override
		public String getRAM() {
			return this.ram;
		}

		@Override
		public String getHDD() {
			return this.hdd;
		}

		@Override
		public String getCPU() {
			return this.cpu;
		

		}
	}

}
