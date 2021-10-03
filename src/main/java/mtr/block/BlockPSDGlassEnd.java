package mtr.block;

import mtr.Items;
import net.minecraft.item.Item;

public class BlockPSDGlassEnd extends BlockPSDAPGGlassEndBase {

	private final int style;

	public BlockPSDGlassEnd(int style) {
		super();
		this.style = style;
	}

	@Override
	public Item asItem() {
		return switch (style) {
			default -> Items.PSD_GLASS_END_1;
			case 1 -> Items.PSD_GLASS_END_2;
			case 2 -> Items.PSD_GLASS_END_3;
			case 3 -> Items.PSD_GLASS_END_4;
		};
	}
}
