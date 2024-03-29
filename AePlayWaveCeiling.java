import java.io.File;
import java.io.IOException; 
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.DataLine.Info; 

public class AePlayWaveCeiling extends Thread { 
	private String filename;
	public Boolean exit=true; 
	public CeilingPanel panel;
	public int count=1;
	public AePlayWaveCeiling(String wavfile,CeilingPanel panel) { 
		filename = wavfile; 
		this.panel=panel;
	} 
	public void run() { 
		
			File soundFile = new File(filename); 
			AudioInputStream audioInputStream = null; 
			try { 
				audioInputStream = AudioSystem.getAudioInputStream(soundFile); 
			} catch (Exception e1) { 
				e1.printStackTrace(); 
				return; 
			} 
			AudioFormat format = audioInputStream.getFormat(); 
			SourceDataLine auline = null; 
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, format); 
			try { 
				auline = (SourceDataLine) AudioSystem.getLine(info); 
				auline.open(format); 
			} catch (Exception e) { 
				e.printStackTrace(); 
				return; 
			} 
			auline.start(); 
			int nBytesRead = 0; 
			byte[] abData = new byte[512]; 
			try {
				while(true){
					if(exit){	 
						while (nBytesRead != -1) {
							count=count+1;
							if(count==6787){
								panel.count=0;
							}
							nBytesRead = audioInputStream.read(abData, 0, abData.length); 
							if (nBytesRead >= 0) 
								auline.write(abData, 0, nBytesRead); 
						}
					}
				}

			} catch (IOException e) { 
				e.printStackTrace(); 
				return; 
			} finally { 

				auline.drain(); 
				auline.close(); 

			} 
		}
	
} 