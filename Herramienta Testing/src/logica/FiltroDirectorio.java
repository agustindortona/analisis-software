package logica;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FiltroDirectorio extends FileFilter{
	@Override
	public boolean accept(File f) {
		if(f.isDirectory())
			return true;
		return false;
	}

	@Override
	public String getDescription() {
		return "wat";
	}

}
