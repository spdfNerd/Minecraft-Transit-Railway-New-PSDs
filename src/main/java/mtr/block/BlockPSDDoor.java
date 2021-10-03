package mtr.block;

import mtr.Items;
import net.minecraft.item.Item;

public class BlockPSDDoor extends BlockPSDAPGDoorBase {

	private final int style;

	public BlockPSDDoor(int style) {
		super();
		this.style = style;
	}

	@Override
	public Item asItem() {
		return switch (style) {
			default -> Items.PSD_DOOR_1;
			case 1 -> Items.PSD_DOOR_2;
			case 2 -> Items.PSD_DOOR_3;
			case 3 -> Items.PSD_DOOR_4;
		};
	}
}
