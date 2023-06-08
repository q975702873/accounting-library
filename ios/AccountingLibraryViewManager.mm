#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface AccountingLibraryViewManager : RCTViewManager
@end

@implementation AccountingLibraryViewManager

RCT_EXPORT_MODULE(AccountingLibraryView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
