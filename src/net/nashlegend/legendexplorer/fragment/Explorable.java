package net.nashlegend.legendexplorer.fragment;

public interface Explorable {
	public void toggleViewMode();

	public void copyFile();

	public void moveFile();

	public void deleteFile();

	public void addNewFile();

	public void refreshFileList();

	public void searchFile(String query);

	public void toggleShowHidden();

	public void renameFile();

	public void zipFile();

	public void propertyFile();
}
