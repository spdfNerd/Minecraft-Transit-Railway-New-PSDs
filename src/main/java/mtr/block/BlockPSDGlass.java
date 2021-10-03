package mtr.block;

import mtr.Items;
import net.minecraft.item.Item;

public class BlockPSDGlass extends BlockPSDAPGGlassBase {

	private final int style;

	public BlockPSDGlass(int style) {
		super();
		this.style = style;
	}

	@Override
	public Item asItem() {
		return switch (style) {
			default -> Items.PSD_GLASS_1;
			case 1 -> Items.PSD_GLASS_2;
			case 2 -> Items.PSD_GLASS_3;
			case 3 -> Items.PSD_GLASS_4;
		};
	}
}
