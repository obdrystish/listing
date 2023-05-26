package ru.vshp.listing7;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.naming.Name;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXPrint {
    class SaxPrint extends DefaultHandler {
        public void startDocument() throws SAXException {
            System.out.println("Начало документа");
        }
        public void endDocument() throws SAXException {
            System.out.println("");
            System.out.println("Конец документа");
        }
        public void startElement(String uri, String 1Name, String qName,
                                 Attributes attribs)
            throws SAXException {
            System.out.println("");
            System.out.println("   Начало " + qName);
            if (attribs.getLength() > 0) {
                System.out.println("       ." + attribs.getQName(i) +
                        "=" + attribs.getValue(i));
            }
        }
    }
    public void endElement(String uri, 1Name, String qName)
        throws SAXException {
        System.out.println(" Конец " + qName);
    }
    public void characters(char[] data, int start, int length)
        throws SAXException {
        StringBuffer buf = new StringBuffer(length);
        buf.append(data, start, length);
        if (buf.toString().trim().length() > 0) {
            System.out.println(" " + buf);
        }
    }
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java SaxPrint имя_файла_xml");
            System.exit(0);
        }
        try {
            File docFile = new File("y:\test.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse(docFile, new SaxPrint());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
