//
// Performace test - Computes 250 fp_sines in a loop
//

#include <math.h>
#include "Definitions.h"

void main (void)
{
	TRISB = 	0;				// all PORTB as output

	while (1)
		{
		unsigned char chrCnt;
		float fltSine;

		PORTB = 	0x0000;		// LEDs OFF
Nop();
		for (chrCnt = 0 ; chrCnt < 250; chrCnt++)	
			{
			fltSine = sin(chrCnt);
			}					// Delay 1.2Meg TCy = 241 ms@20 MHz

		PORTB = 	0xFF;		// LEDs ON
Nop();
		for (chrCnt = 0 ; chrCnt < 250; chrCnt++)	
			{
			fltSine = sin(chrCnt);
			} 					// Delay 1.2Meg TCy = 241 ms@20 MHz
		}
}
