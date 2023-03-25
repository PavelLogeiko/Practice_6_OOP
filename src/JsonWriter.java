public class JsonWriter implements Format {
    @Override
    public <T extends Contact> String createString(T contact) {
        return String.format("""
                {
                "id" : %d, {
                "Фамилия / Организация ":%s,
                "Имя":"%s",
                "Телефон":"%s",
                "Приоритет":"%s",
                "Комментарий":"%s".
                }
                }
                """, contact.getId(), contact.getPersonLastName(), contact.getPersonFirstName(), contact.getNumber(),
                contact.getPriority(), contact.getComment());
    }
}