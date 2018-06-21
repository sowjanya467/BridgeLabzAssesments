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

public class Pc extends Computer
{

		private String ram;
		private String hdd;
		private String cpu;
		
		public Pc(String ram, String hdd, String cpu)
		{
			this.ram=ram;
			this.hdd=hdd;
			this.cpu=cpu;
		}
		@Override
		public String getRAM()
		{
			return this.ram;
		}

		@Override
		public String getHDD()
		{
			return this.hdd;
		}

		@Override
		public String getCPU()
		{
			return this.cpu;
		}
}
