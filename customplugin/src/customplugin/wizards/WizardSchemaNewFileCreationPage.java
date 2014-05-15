package customplugin.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * This class create page when selected schema file, and create project in the first time
 * @author QUOC NGUYEN
 *
 */
public class WizardSchemaNewFileCreationPage extends WizardNewFileCreationPage {
	
	/**
	 * Contructor
	 * @param selection
	 */
	public WizardSchemaNewFileCreationPage(IStructuredSelection selection) {
		super("RmCRC Plug-in Schema File Wizard", selection);

		setTitle("RmCRC Schema File Wizard");
		setDescription("Create a Schema File");
		setFileExtension("xml");
	}

	@Override
	protected InputStream getInitialContents() {
		
		String xmlTemplate = "<rmcrc-schema>\n" + "  <tables></tables>\n"
				+ "  <filters></filters>\n" + "  <views></views>\n"
				+ "</rmcrc-schema>\n";
		return new ByteArrayInputStream(xmlTemplate.getBytes());
		
		// Or create a new file with xml structure
//		String templateFilePath = "/templates/schema-template.xml";
//        InputStream inputStream = null;
//        try {
//            inputStream = Activator.getDefault().getBundle().getEntry(templateFilePath).openStream();
//        } catch (IOException e) {
//            // send back null
//        }
// 
//        return inputStream;
		
	}
}
