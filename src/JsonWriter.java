public class JsonWriter implements Format {
    @Override
    public <T extends Contact> String createString(T task) {
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
                """, task.getId(), task.getPersonLastName(), task.getPersonFirstName(), task.getNumber(),
                task.getPriority(), task.getComment());
    }
}