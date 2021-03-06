package com.kkcorps.bmltoolkitandroid.BasicLearningTemplate;

import android.util.Log;
import android.util.Xml;

import com.kkcorps.bmltoolkitandroid.BasicLearningTemplate.BasicLearningItem;
import com.kkcorps.bmltoolkitandroid.Constants;
import com.kkcorps.bmltoolkitandroid.GlobalModelCollection;
import com.kkcorps.bmltoolkitandroid.Model;
import com.kkcorps.bmltoolkitandroid.Utils.XmlGenerator;

import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.List;

/**
 * Created by root on 6/4/15.
 */
public class BasicLearningGenerator {

    public static void writeXMLData(XmlSerializer xmlSerializer) throws IOException{
            //Insert Data
            xmlSerializer.startTag("","data");
            List<Model> gdList = GlobalModelCollection.globalCollectionList;
            for(int i=0;i<gdList.size();i++){
                xmlSerializer.startTag("","item");

                BasicLearningItem item = (BasicLearningItem) gdList.get(i);
                xmlSerializer.startTag("","item_title");
                xmlSerializer.text(item.getTitle());
                xmlSerializer.endTag("","item_title");

                xmlSerializer.startTag("","item_description");
                xmlSerializer.text(item.getDescription());
                xmlSerializer.endTag("","item_description");

                xmlSerializer.endTag("","item");
            }
            xmlSerializer.endTag("","data");

    }

}
