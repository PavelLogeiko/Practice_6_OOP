public class XmlWriter implements Format{
    @Override
    public <T extends Contact> String createString(T contact) {
        return String.format("""
                <xml>
                <id>%d</id>
                <PersonLastName>%s</PersonLastName>
                <PersonFirstName>%s</PersonFirstName>
                <Number>%s</Number>
                <Priority>%s</Priority>
                <Comment>%s</Comment>
                """, contact.getId(), contact.getPersonLastName(), contact.getPersonFirstName(), contact.getNumber(),
                contact.getPriority(), contact.getComment());
    }
}