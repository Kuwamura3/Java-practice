package capsule;

import capsule.human.HumanNoCapsule;
import capsule.human.HumanCapsule;

public class Capsule01 {
	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanNoCapsule("�c��", 28);
		human1.name = "���c";
		human1.age = 70;
		System.out.println("���O��" + human1.name + "�A�N���" + human1.age + "�ł��B");

		HumanCapsule human2 = new HumanCapsule("����", 32);
		System.out.println("���O��" + human2.name + "�A�N���" + human2.age + "�ł��B");
		human2.setName("���X��");
		System.out.println("�ύX�������O��" + human2.getName() + "�ł��B");
	}
}
