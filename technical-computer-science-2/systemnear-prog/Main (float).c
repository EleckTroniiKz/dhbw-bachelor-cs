/*
-------------------------------------------------------------------
File:		.c
Title: 		
Hardware:	APIC and PICDEM2 Boards
			Simulation also possible
Controller:	PIC18F4520
Frequency:	4x4 MHz (PLL enabled)
Compiler:   XC8 ver. 2.32
MPLAB X     5.50           
Version:	1.2
Date:		26.11.2021
Author:		Aurel GONTEAN, aurel.gontean@upt.ro
-------------------------------------------------------------------
Revision history
 - Ver 1.0, 26.11.2021, Author: Aurel GONTEAN
-------------------------------------------------------------------
Description: 
 
-------------------------------------------------------------------
*/

#include "Definitions.h"

void main (void)
{
	char 			chrD, 	chrM, 	chrR;
	short 			shrtYM, shrtMD, shrtR;
	long 			lngA, 	lngC, 	lngR;
	float 			fltMe,	fltMD, 	fltR;

Nop();
Nop();
	chrD = 27; 			// char (8 biti)
	chrM = 06;
	chrR = chrD / chrM;
Nop();
	shrtYM = 19616; 	// short (16 biti)
	shrtMD = 2706;
	shrtR  = shrtYM / shrtMD;
Nop();
	lngA = 20211125; 	// long (32 biti)
	lngC = 2021;
	lngR = lngA / lngC;
Nop();
	fltMe = 1961.06; 	// float (32 biti)
	fltMD = 27.06;
	fltR = fltMe / fltMD;
Nop();
}
